package Phidgets;
import com.phidget22.*;

public class Challenge
{
   public static void main(String[] args) throws Exception
   {
       //Connect to wireless rover
       Net.addServer("", "192.168.100.1", 5661, "", 0);
       //Create objects
       DCMotor leftMotors = new DCMotor();
       DCMotor rightMotors = new DCMotor();
       DistanceSensor sonar = new DistanceSensor();
       //Address
       leftMotors.setChannel(0);
       rightMotors.setChannel(1);
       //Open connections
       leftMotors.open(5000);
       rightMotors.open(5000);
       sonar.open(5000);
       //Set acceleration
       leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
       rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
       //Move in a square pattern 4 times
       for (int side = 0; side < 4; side++)
       {
           //Move forward
           leftMotors.setTargetVelocity(0.5);
           rightMotors.setTargetVelocity(0.5);
           Thread.sleep(2500);
           //Stop
           leftMotors.setTargetVelocity(0);
           rightMotors.setTargetVelocity(0);
           Thread.sleep(500);
           //Turn 90 degrees - adjusted timing for precise turn
           leftMotors.setTargetVelocity(0.5);
           rightMotors.setTargetVelocity(-0.5);
           Thread.sleep(650); // Reduced from 825ms to 650ms for exact 90-degree turn
           //Stop
           leftMotors.setTargetVelocity(0);
           rightMotors.setTargetVelocity(0);
           Thread.sleep(500);
       }
       //Final stop
       leftMotors.setTargetVelocity(0);
       rightMotors.setTargetVelocity(0);
   }
}
