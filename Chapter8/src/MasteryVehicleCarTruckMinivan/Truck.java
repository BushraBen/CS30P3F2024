package MasteryVehicleCarTruckMinivan;


	public class Truck 
		extends Vehicle 
{
    private double cargoCapacity;
    private boolean hasTailgate;

    public Truck(
    	String make, 
    	String model, 
    	int year, 
    	String fuelType, 
    	double fuelEfficiency, 
    	double cargoCapacity, 
    	boolean hasTailgate) 
    {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
        this.hasTailgate = hasTailgate;
    }

    
    public void start() 
    {
        System.out.println("The truck's engine is starting.");
    }


    public void stop() 
    {
        System.out.println("The truck's engine is stopping.");
    }
  
    public void loadCargo() 
    {
        System.out.println("Loading cargo into the truck.");
    }


    public String toString() 
    {
        return super.toString() + "Cargo capacity: " + cargoCapacity + " tons, " + (hasTailgate ? "Has tailgate" : "No tailgate");
    }
}


