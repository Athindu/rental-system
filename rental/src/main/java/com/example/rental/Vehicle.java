package com.example.rental;

public class Vehicle {

    private int Id;
    private String plateNum;
    private String model;
    private String brand;
    private int millage;

    public Vehicle() {
    }

    public Vehicle(int id, String plateNum, String model, String brand, int millage) {
        Id = id;
        this.plateNum = plateNum;
        this.model = model;
        this.brand = brand;
        this.millage = millage;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
                "Id=" + Id +
                ", plateNum='" + plateNum + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", millage=" + millage +
                '}';
    }
}
