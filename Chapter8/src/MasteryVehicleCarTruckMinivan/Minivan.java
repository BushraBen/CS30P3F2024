package MasteryVehicleCarTruckMinivan;

public class Minivan extends Vehicle 
{
    private int numSeats;
    private boolean hasSlidingDoors;

    public Minivan(
    		String make, 
    		String model, 
    		int year, 
    		String fuelType, 
    		double fuelEfficiency, 
    		int numSeats, 
    		boolean hasSlidingDoors
    	) 
    {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
        this.hasSlidingDoors = hasSlidingDoors;
    }


    public void start() 
    {
        System.out.println("The minivan's engine is starting.");
    }

   
    public void stop() 
    {
        System.out.println("The minivan's engine is stopping.");
    }

    public void openSlidingDoor() 
    {
        if (hasSlidingDoors) 
        {
            System.out.println("Opening the sliding door.");
        } else 
        {
            System.out.println("This minivan doesn't have sliding doors.");
        }
    }

    
    public String toString() 
    {
        return super.toString() + " Seats: " + numSeats + ", " + (hasSlidingDoors ? "Has sliding doors" : "No sliding doors");
    }
}


