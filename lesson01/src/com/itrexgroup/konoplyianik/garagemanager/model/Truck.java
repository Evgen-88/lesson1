package com.itrexgroup.konoplyianik.garagemanager.model;

public class Truck extends Car {
	private String brand;
	private String model;
	private String manufactureYear;
	private String color;
	private double maxSpeed;
	private double cost;
	
	private double capacity;

	public Truck(String brand, String model, String manufactureYear, String color, double maxSpeed, double cost, double capacity) {
		super(brand, model, manufactureYear, color, maxSpeed, cost);
		this.brand = brand;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.cost = cost;
		
		this.capacity = capacity;
	}
	
	public double getCapasity() {
		return capacity;
	}
	
	@Override
	public int hashCode() {
		int result = super.hashCode();
		long temp = Double.doubleToLongBits(capacity);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (Double.doubleToLongBits(maxSpeed) != Double.doubleToLongBits(other.maxSpeed))
			return false;
		if(brand == null && other.brand != null || !brand.equals(other.brand))
			return false;
		if(model == null && other.model != null || !model.equals(other.model))
			return false;
		if(manufactureYear == null && other.manufactureYear != null || !manufactureYear.equals(other.manufactureYear))
			return false;
		if(color == null && other.color != null || !color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return Class.class.getSimpleName() + "[" + brand + "  " + model + " " + manufactureYear + " year of manufacture,"
				+ color + " color, maxSpeed=" + maxSpeed + ", cost= $" + cost + ", capacity= " + capacity + "t]";
	}
}
