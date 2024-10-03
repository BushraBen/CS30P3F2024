package SkillBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Part 1
        File newFile = new File("zzz.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("File 'zzz.txt' has been created.");
            } else {
                System.out.println("File 'zzz.txt' already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
            scanner.close();
            return;
        }
        
        System.out.print("Do you want to keep the file? (yes/no): ");
        String keepFile = scanner.nextLine().toLowerCase();
        
        if (keepFile.equals("no")) {
            if (newFile.delete()) {
                System.out.println("File 'zzz.txt' has been successfully deleted.");
            } else {
                System.out.println("Failed to delete the file 'zzz.txt'.");
            }
        } else {
            System.out.println("File 'zzz.txt' has been kept.");
        }
        
        // Part 2
        System.out.print("Enter the name or path of a file to check: ");
        String filePath = scanner.nextLine();
         
        
        File fileToCheck = new File(filePath);
        
        if (fileToCheck.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }
        
        scanner.close();
    }
}
