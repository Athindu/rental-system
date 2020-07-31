package com.example.rental;

public class Bike {

    private String starttype;
    private String type;

    public Bike() {
    }

    public Bike(String starttype, String type) {
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
        return "Bike{" +
                "starttype='" + starttype + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
