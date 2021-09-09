package com.itrexgroup.konoplyianik.garagemanager.service;

import java.util.HashMap;
import java.util.Map;

import com.itrexgroup.konoplyianik.garagemanager.model.Car;
import com.itrexgroup.konoplyianik.garagemanager.model.Garage;

public class GarageService {
	private Garage garage = new Garage();
	
	private Map<Car, Integer> newCars = new HashMap<>();
	private Map<String, Integer> newCarTypes = new HashMap<>();
	
	public GarageService() {
	}
	
	public void parkCar(Car car) {
		Map<Car, Integer> cars = garage.getCars();
		Map<String, Integer> carTypes = garage.getCarTypes();
		String type = car.getClass().getSimpleName();
		
		if(cars.containsKey(car))
			newCars.put(car, cars.get(car) + 1);
		else
			newCars.put(car, 1);
		System.out.println(car.getBrand() + " " + car.getModel() + " successfully parked.");
		
		if(carTypes.containsKey(type))
			newCarTypes.put(type, carTypes.get(type) + 1);
		else
			newCarTypes.put(type, 1);
		
		garage.setCars(newCars);
		garage.setCarTypes(newCarTypes);
	}
	
	public void takeCar(Car car) {
		Map<Car, Integer> cars = garage.getCars();
		Map<String, Integer> carTypes = garage.getCarTypes();
		String type = car.getClass().getSimpleName();
		
		if(cars.get(car) > 1) {
			newCars.remove(car);
			System.out.println(car.getBrand() + " " + car.getModel() + " successfully taken.");
			newCarTypes.put(type, carTypes.get(type) - 1);
		}else if(cars.get(car) == 1) {
			newCars.remove(car, 1);
			System.out.println(car.getBrand() + " " + car.getModel() + " successfully taken.");
			newCarTypes.remove(type, 1);
		}else
			System.out.println("Sorry, your car is not here.");
		
		garage.setCars(newCars);
		garage.setCarTypes(newCarTypes);
	}
	
	public void countCarsByTypes() {
		Map<String, Integer> carTypes = garage.getCarTypes();
		
		for(Map.Entry<String, Integer> pair : carTypes.entrySet()) {
			System.out.println(pair.getKey() + " - " + pair.getValue());
		}
	}
	
}
