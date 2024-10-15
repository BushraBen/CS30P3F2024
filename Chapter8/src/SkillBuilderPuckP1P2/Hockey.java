package SkillBuilderPuckP1P2;

import java.util.Arrays;

public class Hockey {
    public static void main(String[] args) {
        Puck standardPuck = new Puck(5.2);
        Puck youthPuck = new Puck(4.3);
        Puck invalidPuck = new Puck(6.0);

        System.out.println("Standard Puck: " + standardPuck);
        
        System.out.println("Youth Puck: " + youthPuck);
        
        System.out.println("Invalid Puck: " + invalidPuck);

        System.out.println("Standard Puck Weight: " + standardPuck.getWeight() + " oz");
        
        System.out.println("Standard Puck Division: " + standardPuck.getDivision());
       

        System.out.println("Youth Puck Weight: " + youthPuck.getWeight() + " oz");
        
        System.out.println("Youth Puck Division: " + youthPuck.getDivision());

        System.out.println("Invalid Puck Weight: " + invalidPuck.getWeight() + " oz");
        
        System.out.println("Invalid Puck Division: " + invalidPuck.getDivision());

        Puck anotherStandardPuck = new Puck(5.2);
        
        System.out.println("Are standard pucks equal? " + standardPuck.equals(anotherStandardPuck));

       
        System.out.println("Compare standard puck to youth puck: " + standardPuck.compareTo(youthPuck));
        
        System.out.println("Compare youth puck to standard puck: " + youthPuck.compareTo(standardPuck));
        
        System.out.println("Compare standard puck to another standard puck: " + standardPuck.compareTo(anotherStandardPuck));

        
        Puck[] pucks = {standardPuck, youthPuck, invalidPuck, anotherStandardPuck};
        
        Arrays.sort(pucks);
        
        System.out.println("Sorted pucks:");
        
        for (Puck puck : pucks) {
        	
            System.out.println(puck);
        }
    }
}