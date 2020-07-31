package com.example.rentalApp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
}
