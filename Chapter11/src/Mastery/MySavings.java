package Mastery;
import java.util.Scanner;
import java.io.*;

public class MySavings {

    private static final String FILENAME = "piggybank.txt";

    public static void main(String[] args) {
        // Create a new scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Load or create a new PiggyBank
        PiggyBank piggyBank = loadPiggyBank();

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
            
            // Process the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Total in bank: $" + (piggyBank.getTotal() / 100.0));
                    break;
                case 2:
                    piggyBank.addPenny();
                    System.out.println("Penny added.");
                    break;
                case 3:
                    piggyBank.addNickel();
                    System.out.println("Nickel added.");
                    break;
                case 4:
                    piggyBank.addDime();
                    System.out.println("Dime added.");
                    break;
                case 5:
                    piggyBank.addQuarter();
                    System.out.println("Quarter added.");
                    break;
                case 6:
                    System.out.print("Enter amount to remove (in cents): ");
                    int amountToRemove = scanner.nextInt();
                    if (amountToRemove > piggyBank.getTotal()) {
                        System.out.println("Insufficient funds in the piggy bank.");
                    } else {
                        piggyBank.removeCoins(amountToRemove, 0, 0, 0); // Simplified removal
                        System.out.println("$" + (amountToRemove / 100.0) + " removed from the bank.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Save the PiggyBank before quitting
        savePiggyBank(piggyBank);

        // Close the scanner
        scanner.close();
    }
    
   

    private static PiggyBank loadPiggyBank() {
        PiggyBank piggyBank = new PiggyBank();
        try (Scanner fileScanner = new Scanner(new File(FILENAME))) {
            piggyBank.setPennies(fileScanner.nextInt());
            piggyBank.setNickels(fileScanner.nextInt());
            piggyBank.setDimes(fileScanner.nextInt());
            piggyBank.setQuarters(fileScanner.nextInt());
            System.out.println("Piggy bank loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing piggy bank found. Creating a new one.");
        } catch (Exception e) {
            System.out.println("Error loading piggy bank. Creating a new one.");
        }
        return piggyBank;
    }

    private static void savePiggyBank(PiggyBank piggyBank) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            writer.println(piggyBank.getPennies());
            writer.println(piggyBank.getNickels());
            writer.println(piggyBank.getDimes());
            writer.println(piggyBank.getQuarters());
            System.out.println("Piggy bank saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving piggy bank: " + e.getMessage());
        }
    }
}