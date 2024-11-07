package Phidgets;

import com.phidget22.*;

public class Challenge {
    public static void main(String[] args) throws Exception 
    {
        // Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        // Create motors and distance sensor
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        // Set the channels for motors
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        // Open the devices with a timeout of 5000 milliseconds
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        // Constants for square movement
        final double SQUARE_SIDE_TIME = 4000; 
        final double FORWARD_SPEED = 0.35; 
        final int TURN_TIME = 2000; 
        final double OBSTACLE_DISTANCE = 200; 
        
        // Time the operation
        long startTime = System.currentTimeMillis();

        // Move around the square (4 sides)
        for (int i = 0; i < 4; i++) 
        {
            // Move forward along one side of the square
            moveForward(SQUARE_SIDE_TIME, FORWARD_SPEED, leftMotors, rightMotors, sonar, OBSTACLE_DISTANCE);

            // Turn 90 degrees
            turn90Degrees(leftMotors, rightMotors);

            // Check if last side of square
            if (i == 3) 
            {
                break;
            }
        }

        // Stop rover after completing the square
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);

        // Calculate time taken to complete the square
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to complete the square: " + (endTime - startTime) + " milliseconds");
    }

    // Function to move the rover forward
    private static void moveForward(double timeToMove, double speed, DCMotor leftMotors, DCMotor rightMotors, DistanceSensor sonar, double obstacleDistance) throws Exception {
        leftMotors.setTargetVelocity(speed);
        rightMotors.setTargetVelocity(speed);

        long startTime = System.currentTimeMillis();
        long timeElapsed;

        while (true) 
        {
            timeElapsed = System.currentTimeMillis() - startTime;

            // Obstacle detection
            if (sonar.getDistance() < obstacleDistance) 
            {
                // If Obstacle is detected: stop and turn around 180 degrees
                System.out.println("Obstacle detected! Turning 180 degrees.");
                stopMotors(leftMotors, rightMotors);
                turn180Degrees(leftMotors, rightMotors);
                moveForward(timeToMove - timeElapsed, speed, leftMotors, rightMotors, sonar, obstacleDistance);
                break;
            }

            // Check if the rover has moved for the specified time
            if (timeElapsed >= timeToMove) 
            {
                break;
            }

            Thread.sleep(50);
        }
        
        stopMotors(leftMotors, rightMotors);
    }

    // Function to turn the rover 90 degrees
    private static void turn90Degrees(DCMotor leftMotors, DCMotor rightMotors) throws Exception 
    {
        leftMotors.setTargetVelocity(0.5);
        rightMotors.setTargetVelocity(-0.5);

        Thread.sleep(2000);

        stopMotors(leftMotors, rightMotors);
    }

    // Function to turn the rover 180 degrees (reverse direction)
    private static void turn180Degrees(DCMotor leftMotors, DCMotor rightMotors) throws Exception 
    {
        leftMotors.setTargetVelocity(0.5);
        rightMotors.setTargetVelocity(-0.5);

        Thread.sleep(4000);

        stopMotors(leftMotors, rightMotors);
    }

 // Function to stop both motors
    private static void stopMotors(DCMotor leftMotors, DCMotor rightMotors) throws PhidgetException 
    {
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
    }
}