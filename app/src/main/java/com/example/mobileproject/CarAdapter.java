package com.example.mobileproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private List<Car> cars;

    public CarAdapter(List<Car> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.imageViewCar.setImageResource(car.getImageResourceId());
        holder.textViewCarType.setText(car.getType());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    static class CarViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewCar;
        TextView textViewCarType;

        CarViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCar = itemView.findViewById(R.id.imageViewCar);
            textViewCarType = itemView.findViewById(R.id.textViewCarType);
        }
    }
}