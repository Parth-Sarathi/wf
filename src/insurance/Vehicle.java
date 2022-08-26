package insurance;

public abstract class Vehicle {
	
	String model;
	
	int price;
	
	abstract double calculatePremium(String x, double y);
}
