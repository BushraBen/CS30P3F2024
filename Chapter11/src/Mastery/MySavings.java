package Mastery;

import java.util.Scanner;

public class MySavings {

  public static void main(String[] args) {

    // Create a new scanner to read user input
    Scanner scanner = new Scanner(System.in);

    while (true) {
      
      // Print out the menu options
      System.out.println("1. Show total in bank");   
      System.out.println("2. Add a penny");
      System.out.println("3. Add a nickel");
      System.out.println("4. Add a dime");
      System.out.println("5. Add a quarter");
      System.out.println("6. Take money out of bank");
      System.out.println("0. Quit");
      
      // Prompt the user to choose an option
      System.out.print("Enter your choice: "); 
      
      // Read the user's choice
      int choice = scanner.nextInt();
      
      // Check if the user wants to quit
      if (choice == 0) {
        break;
      }
      
      
    }

    // Close the scanner
    scanner.close();
  }

}