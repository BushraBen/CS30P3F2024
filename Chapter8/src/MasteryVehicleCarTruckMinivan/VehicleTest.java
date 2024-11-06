package MasteryVehicleCarTruckMinivan;

public class VehicleTest 
{
    public static void main(String[] args) 
    {
        Car car = new Car("Toyota", "Camry", 2022, "Gasoline", 30.5, 4, false);
        
        Truck truck = new Truck("Ford", "F-150", 2021, "Diesel", 22.0, 2.5, true);
        
 
        Minivan minivan = new Minivan("Honda", "Odyssey", 2023, "Hybrid", 28.0, 8, true);

        System.out.println("Car details: " + car);
        car.start();
        car.accelerate();
        car.openTrunk();
        car.brake();
        car.stop();
        System.out.println();

        System.out.println("Truck details: " + truck);
        truck.start();
        truck.accelerate();
        truck.loadCargo();
        truck.brake();
        truck.stop();
        System.out.println();

        System.out.println("Minivan details: " + minivan);
        minivan.start();
        minivan.accelerate();
        minivan.openSlidingDoor();
        minivan.brake();
        minivan.stop();
    }
}
