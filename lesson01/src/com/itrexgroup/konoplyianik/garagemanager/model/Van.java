package com.itrexgroup.konoplyianik.garagemanager.model;

public class Van extends Car {
	private String brand;
	private String model;
	private String manufactureYear;
	private String color;
	private double maxSpeed;
	private double cost;
	
	private double capacity;
	private boolean neBitaNeKrashena;

	public Van(String brand, String model, String manufactureYear, String color, double maxSpeed,
			double cost, double capacity, boolean neBitaNeKrashena) {
		super(brand, model, manufactureYear, color, maxSpeed, cost);
		this.brand = brand;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.cost = cost;
		
		this.capacity = capacity;
		this.neBitaNeKrashena = neBitaNeKrashena;
	}
	
	public double getCapasity() {
		return capacity;
	}
	
	public boolean isNeBitaNeKrashena() {
		return neBitaNeKrashena;
	}
	
	public void setIsNeBitaNeKrashena(boolean neBitaNeKrashena) {
		this.neBitaNeKrashena = neBitaNeKrashena;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (neBitaNeKrashena ? 1231 : 1237);
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
		Van other = (Van) obj;
		if (neBitaNeKrashena != other.neBitaNeKrashena)
			return false;
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
		return this.getClass().getSimpleName() + "[" + brand + "  " + model + " " + manufactureYear + " year of manufacture,"
				+ color + " color, maxSpeed=" + maxSpeed + ", cost= $" + cost + ", capacity= " + capacity + "t, "
				+ (neBitaNeKrashena ? "almost new]" : "good condition]");
	}
}
