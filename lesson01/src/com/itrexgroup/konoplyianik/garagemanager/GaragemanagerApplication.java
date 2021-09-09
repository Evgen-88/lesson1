package com.itrexgroup.konoplyianik.garagemanager;

import com.itrexgroup.konoplyianik.garagemanager.model.Sedan;
import com.itrexgroup.konoplyianik.garagemanager.model.Truck;
import com.itrexgroup.konoplyianik.garagemanager.model.Van;
import com.itrexgroup.konoplyianik.garagemanager.service.GarageService;

/*
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 4-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */

public class GaragemanagerApplication {

	public static void main(String[] args) {
		GarageService garage = new GarageService();
		garage.parkCar(new Sedan("Peugeot", "406", "2000", "gray", 190.0, 5000.0, true));
		garage.parkCar(new Van("Mersedes", "Sprinter", "2006", "wite", 160.0, 15000.0, 3.2, true));
		garage.parkCar(new Sedan("Peugeot", "406", "2000", "gray", 190.0, 5000.0, true));
		garage.parkCar(new Sedan("Ford", "Mondeo", "2010", "red", 210.0, 8000.0, true));
		garage.parkCar(new Truck("Scania", "R470", "2018", "black", 140.0, 50000.0, 19.0));
		garage.parkCar(new Sedan("Peugeot", "406", "2000", "gray", 190.0, 5000.0, true));
		
		garage.countCarsByTypes();
		
		garage.takeCar(new Sedan("Peugeot", "406", "2000", "gray", 190.0, 5000.0, true));
		
		garage.countCarsByTypes();
		
		garage.takeCar(new Truck("Scania", "R470", "2018", "black", 140.0, 50000.0, 19.0));
		
		garage.countCarsByTypes();
		
	}

}
