package com.example.sec1_listview_app.dataaccess;

import androidx.annotation.NonNull;

public class Car {
    private String name;
    private double price;
    private String brand;
    private int year;
    private String description;

    public Car(String name, double price, String brand, int year, String description) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.year = year;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return name + ", Year: " + year;
    }
}
