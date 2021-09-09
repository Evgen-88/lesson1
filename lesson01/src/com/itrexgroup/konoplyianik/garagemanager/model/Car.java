package com.itrexgroup.konoplyianik.garagemanager.model;

public abstract class Car {
	private String brand;
	private String model;
	private String manufactureYear;
	private String color;
	private double maxSpeed;
	private double cost;
	
	protected Car(String brand, String model, String manufactureYear, String color, double maxSpeed, double cost) {
		this.brand = brand;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getManufactureYear() {
		return manufactureYear;
	}

	public String getColor() {
		return color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public double getCost() {
		return cost;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + ((brand == null) ? 0 : brand.hashCode());
		result = 31 * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + ((manufactureYear == null) ? 0 : manufactureYear.hashCode());
		temp = Double.doubleToLongBits(maxSpeed);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if(brand == null && other.brand != null || !brand.equals(other.brand))
			return false;
		if(model == null && other.model != null || !model.equals(other.model))
			return false;
		if(manufactureYear == null && other.manufactureYear != null || !manufactureYear.equals(other.manufactureYear))
			return false;
		if(color == null && other.color != null || !color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (Double.doubleToLongBits(maxSpeed) != Double.doubleToLongBits(other.maxSpeed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", manufactureYear=" + manufactureYear + ", color=" + color
				+ ", maxSpeed=" + maxSpeed + ", cost=" + cost + "]";
	}
}
