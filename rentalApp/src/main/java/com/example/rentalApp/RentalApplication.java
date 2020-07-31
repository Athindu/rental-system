package com.example.rentalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentalApplication implements CommandLineRunner {

	@Autowired
	VehicleRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RentalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Vehicle v1 = new Vehicle("CAT-8459","CHR","Toyota",5000);
		Vehicle v2 = new Vehicle("CAQ-3239","Wrangler","Jeep",1000);
		Vehicle v3 = new Vehicle("PC-1038","HILUX","Toyota",250);
		Vehicle v4 = new Car("CAA-4439","WRX","Subaru",300,"Have","Manual");
		Vehicle v5 = new Car("CAB-9329","Aventador","Lamborghini",10,"Have","Manual");
		Vehicle v6 = new Car("CAc-9001","GT-R","Nissan",100,"No","Manual");
		Vehicle v7 = new Car("CAT-8229","Aqua","Toyota",20000,"Have","Auto");
		Vehicle v8 = new Car("CAT-9069","Prius","Toyota",60000,"Have","Auto");
		Vehicle v9 = new Bike("GG-2658","Classic","Royal Enfield",0,"Kick","Normal");
		Vehicle v10 = new Bike("BAC-9398","Dio","Honda",60,"Self","Scooty");
		repository.save(v1);
		repository.save(v2);
		repository.save(v3);
		repository.save(v4);
		repository.save(v5);
		repository.save(v6);
		repository.save(v7);
		repository.save(v8);
		repository.save(v9);
		repository.save(v10);

	}
}
