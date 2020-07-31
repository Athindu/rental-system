package com.example.rentalApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class VehicleController {

    @Autowired
    VehicleService service;

    @GetMapping("/vehicles")
    public List<Vehicle> getAll(){
        return service.getVehi();
    }

    @PostMapping("/vehicles/add")
    public void addV(@RequestBody Vehicle vehicle){
        service.addVehi(vehicle);
    }

    @PutMapping("/vehicles/{plateNum}/edit")
    public void updateV(@PathVariable("plateNum") String plateNum, @RequestBody Vehicle vehicle ){
        service.updateVehi(vehicle);
    }

    @DeleteMapping("/vehicles/{plateNum}/delete")
    public void deleteV(@PathVariable("plateNum") String plateNum){
        service.deleteVehi(plateNum);
    }

}
