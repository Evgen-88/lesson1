package com.itrexgroup.konoplyianik.garagemanager.model;

public class Sportcar extends Car {
	private String brand;
	private String model;
	private String manufactureYear;
	private String color;
	private double maxSpeed;
	private double cost;
	
	private int from0To100;

	public Sportcar(String brand, String model, String manufactureYear, String color, double maxSpeed, double cost, int from0To100) {
		super(brand, model, manufactureYear, color, maxSpeed, cost);
		this.brand = brand;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.cost = cost;
		
		this.from0To100 = from0To100;
	}
	
	public int getFrom0No100() {
		return from0To100;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + from0To100;
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
		Sportcar other = (Sportcar) obj;
		if (from0To100 != other.from0To100)
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
		return this.getClass().getSimpleName() + "[" + brand + "  " + model + " " + manufactureYear + " year of manufacture, "
				+ color + " color, maxSpeed=" + maxSpeed + ", cost= $" + cost + ", from 0 to 100km/h in " + from0To100 + "s]";
	}
}
