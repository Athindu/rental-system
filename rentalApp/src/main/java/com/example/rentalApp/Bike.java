package com.example.rentalApp;

public class Bike extends Vehicle{

    private String starttype;
    private String type;

    public Bike() {
    }

    public Bike(String plateNum, String model, String brand, int millage, String starttype, String type) {
        super(plateNum, model, brand, millage);
        this.starttype = starttype;
        this.type = type;
    }

    public String getStarttype() {
        return starttype;
    }

    public void setStarttype(String starttype) {
        this.starttype = starttype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bike{" +super.toString()+
                "starttype='" + starttype + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
