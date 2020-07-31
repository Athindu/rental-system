package com.example.rental;

public class Car extends Vehicle {

    private String ac;
    private String transmission;

    public Car() {
    }

    public Car(String ac, String transmission) {
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
        return "Car{" +
                "ac='" + ac + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
