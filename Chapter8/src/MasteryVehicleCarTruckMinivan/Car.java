package MasteryVehicleCarTruckMinivan;

	public class Car 
		extends Vehicle 
{
    private int numberDoors;
    private boolean isConvertible;

    public Car(String make, String model, 
    		int year, String fuelType, 
    		double fuelEfficiency, 
    		int numberDoors, 
    		boolean isConvertible) 
    {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numberDoors = numberDoors;
        this.isConvertible = isConvertible;
    }

    
    public void start() 
    {
        System.out.println("The car's engine is starting.");
    }

    
    public void stop() 
    {
        System.out.println("The car's engine is stopping.");
    }

    public void openTrunk() 
    {
        System.out.println("The car's trunk is opening.");
    }

    
    public String toString() 
    {
        return super.toString() + " - " + numberDoors + " doors, " + (isConvertible ? "Convertible" : "Not convertible");
    }
}


