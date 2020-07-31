package com.example.rentalApp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicles")
public class Vehicle {

    @Id
    private String plateNum;
    private String model;
    private String brand;
    private int millage;

    public Vehicle() {
    }

    public Vehicle(String plateNum, String model, String brand, int millage) {
        this.plateNum = plateNum;
        this.model = model;
        this.brand = brand;
        this.millage = millage;
    }


    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", plateNum='" + plateNum + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", millage=" + millage +
                '}';
    }
}
