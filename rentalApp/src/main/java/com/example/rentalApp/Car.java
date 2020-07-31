package com.example.rentalApp;

public class Car extends Vehicle {

    private String ac;
    private String transmission;

    public Car() {
    }

    public Car(String plateNum, String model, String brand, int millage, String ac, String transmission) {
        super(plateNum, model, brand, millage);
        this.ac = ac;
        this.transmission = transmission;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +super.toString()+
                "ac='" + ac + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
