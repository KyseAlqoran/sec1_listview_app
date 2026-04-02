package com.example.sec1_listview_app.dataaccess;

import java.util.ArrayList;
import java.util.List;

public class Car_Details {
    private List<Car> cars = new ArrayList<>();

    public Car_Details() {
        cars.add(new Car("911", 200000, "Porsche", 2025, "Sport car with a nice design"));
        cars.add(new Car("Range Rover", 175000, "Land Rover", 2021, "A Strong and comfortable"));
        cars.add(new Car("Altima", 80000, "Nissan", 2018, "Comfortable and simple"));
        cars.add(new Car("CX-5", 100000, "Mazda", 2020, "A nice SUV and easy to drive"));
        cars.add(new Car("Wrangler", 250000, "Jeep", 2024, "A strong car, Good for mountains and sand"));
        cars.add(new Car("Tucson", 120000, "Hyundai", 2021, "A family SUV, Safe and comfortable"));
        cars.add(new Car("Elantra", 60000, "Hyundai", 2019, "A small car, cheap and easy to use"));
        cars.add(new Car("X5", 400000, "BMW", 2026, "A luxury SUV, it is strong and fast"));
        cars.add(new Car("Civic", 90000, "Honda", 2022, "A small sport car and easy to drive"));
        cars.add(new Car("Camry", 50000, "Toyota", 2016, "A comfortable car and good for families"));
        cars.add(new Car("X3", 300000, "BMW", 2024, "A luxury SUV, it is strong and fast"));
        cars.add(new Car("Corolla", 40000, "Toyota", 2015, "A small sport car and it is cheap and saves fuel"));
        cars.add(new Car("Model Y", 350000, "Tesla", 2025, "An electric SUV and it has a big space"));
        cars.add(new Car("Model 3", 500000, "Tesla", 2024, "An electric car and it is fast and modern"));
        cars.add(new Car("3 Series", 280000, "BMW", 2023, "A sport car, it drive very well"));
        cars.add(new Car("C-Class", 240000, "Mercedes", 2025, "A luxury car and it smooth and nice"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
