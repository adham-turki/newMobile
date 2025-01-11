package com.example.mobileproject;

public class Car {
    private String type;
    private int imageResourceId;

    public Car(String type, int imageResourceId) {
        this.type = type;
        this.imageResourceId = imageResourceId;
    }

    public String getType() {
        return type;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}