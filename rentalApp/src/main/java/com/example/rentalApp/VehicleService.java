package com.example.rentalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository repository;

    public List<Vehicle> getVehi(){
        return repository.findAll();
    }

    public void addVehi(Vehicle vehicle){
        repository.save(vehicle);
    }


    public void deleteVehi(String plate){
        repository.deleteById(plate);
    }


    public void updateVehi(Vehicle vehicle){
        repository.save(vehicle);
    }

}
