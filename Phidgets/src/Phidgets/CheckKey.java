package Phidgets;

public class CheckKey 
{
	

public class Challenge 
{
    public static void main(String[] args) throws Exception 
    {

        // Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);
        
        int distance = 0; // Initialize distance counter
        int turnDirection = 1; // Initialize turn direction
        
        // Create motor and distance sensor objects
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        // Address motors
        leftMotors.setHubPort(5);
        leftMotors.setChannel(0);
        rightMotors.setHubPort(5);
        rightMotors.setChannel(1);

        // Open connections to motors and sensor
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        
        // Set maximum acceleration for motors
        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
        
        // Loop to move the rover in a square
        for (int i = 0; i < 4; i++) 
        {
            while (distance < 22) 
            { // Move forward for a set distance
                rightMotors.setTargetVelocity(-1);
                leftMotors.setTargetVelocity(1);
                distance++;
                
                // Check for obstacle
                if (sonar.getDistance() < 400) 
                {
                    // Stop motors if obstacle is detected
                    rightMotors.setTargetVelocity(0);
                    leftMotors.setTargetVelocity(0);
                    Thread.sleep(500);
                    
                    // Move backward
                    rightMotors.setTargetVelocity(1);
                    leftMotors.setTargetVelocity(1);
                    Thread.sleep(500);
                    
                    // Stop motors
                    rightMotors.setTargetVelocity(0);
                    leftMotors.setTargetVelocity(0);
                    Thread.sleep(500);
                    
                    // Move backward for a set distance
                    while (distance > 3) 
                    {
                        rightMotors.setTargetVelocity(-1);
                        leftMotors.setTargetVelocity(1);
                        distance--;
                    }
                    
                    // Change turn direction
                    turnDirection = -turnDirection;
                    distance = 22; // Set distance to exit loop
                }
            }
            
            // Reset distance counter for next side of the square
            distance = 0;
            
            // Stop motors before turning
            rightMotors.setTargetVelocity(0);
            leftMotors.setTargetVelocity(0);
            Thread.sleep(500);
            
            // Turn rover
            rightMotors.setTargetVelocity(turnDirection);
            leftMotors.setTargetVelocity(turnDirection);
            Thread.sleep(250);
            
            // Stop motors after turning
            rightMotors.setTargetVelocity(0);
            leftMotors.setTargetVelocity(0);
            Thread.sleep(500);
        }

        // Stop motors after completing the square
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
    }

}
