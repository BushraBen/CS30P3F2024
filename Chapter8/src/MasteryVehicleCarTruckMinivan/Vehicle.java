package MasteryVehicleCarTruckMinivan;

public abstract class Vehicle 
{
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;
    protected double fuelEfficiency;

    public Vehicle(
	String make, 
	String model, 
	int year, 
	String 
	fuelType, 
	double fuelEfficiency) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public abstract void start();
    public abstract void stop();

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public void brake() {
        System.out.println("The vehicle is braking.");
    }

    public String toString() {
        return year + " " + make + " " + model + " (" + fuelType + ")";
    }
}



