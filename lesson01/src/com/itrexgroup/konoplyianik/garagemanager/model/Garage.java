package com.itrexgroup.konoplyianik.garagemanager.model;

import java.util.*;

public class Garage {
	private Map<Car, Integer> cars = new HashMap<>();
	private Map<String, Integer> carTypes = new HashMap<>();
	
	public Garage() {
	}
	
	public Map<Car, Integer> getCars() {
		return cars;
	}

	public void setCars(Map<Car, Integer> map) {
		this.cars = map;
	}

	public Map<String, Integer> getCarTypes() {
		return carTypes;
	}

	public void setCarTypes(Map<String, Integer> carTypes) {
		this.carTypes = carTypes;
	}

}
