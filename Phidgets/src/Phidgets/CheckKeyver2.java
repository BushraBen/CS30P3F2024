package Phidgets;

public class CheckKeyver2 
{

	  Net.addServer("", "192.168.100.1", 5661, "", 0);

      //Create
      DCMotor leftMotors = new DCMotor();
      DCMotor rightMotors = new DCMotor();
      DistanceSensor sonar = new DistanceSensor();

      //Address
      leftMotors.setChannel(0);
      rightMotors.setChannel(1);

      //Open
      leftMotors.open(5000);
      rightMotors.open(5000);
      sonar.open(5000);
       
        for(int i = 0; i <= 3; i++) //this for loop makes the rover go around the 1m by 1m square - all of these things repeat four times (square has four sides)
        {
      	    leftMotors.setTargetVelocity(-0.65); //makes the rover move forward
      	    rightMotors.setTargetVelocity(-0.65);
      	             
      	    Thread.sleep(2150); //rover moves forward for 2.15 seconds
      	             
      	    leftMotors.setTargetVelocity(0.5); //makes the rover turn 90 degrees
      	    rightMotors.setTargetVelocity(-0.5);
      	             
      	    Thread.sleep(975); //the time it turns for
      }
      	
	
	    if(sonar.getDistance() < 400) //if the rover detects an object within 400m of its sensor, then:
	    {
	    	leftMotors.setTargetVelocity(0.5); //turns 180 degrees
	    	rightMotors.setTargetVelocity(-0.5);
	    	 
	    	Thread.sleep(775); //the time the rover turns for
	    	
	    	leftMotors.setTargetVelocity(-0.5); //rover moves forward for 1.5 seconds
	    	rightMotors.setTargetVelocity(-0.5);
	    	
	    	Thread.sleep(1500);
	    }
	    
	    else //if the rover DOES NOT detect an object within 400 m of its sensor, then:
	    {
	    	leftMotors.setTargetVelocity(-0.5); //moves forward for 1.7 seconds
	    	rightMotors.setTargetVelocity(-0.5);
	    	
	    	Thread.sleep(1700);
	    	
	    	leftMotors.setTargetVelocity(0); //stops all motors - rover stops
	    	rightMotors.setTargetVelocity(0);
	    }
      
      

	}
}
