package SkillBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StuName> students = new ArrayList<>();

        
        System.out.print("Enter the file name to store student names: ");
        String fileName = scanner.nextLine();

     
        System.out.print("Enter the number of students in the class: ");
        int numStudents = Integer.parseInt(scanner.nextLine());

       
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter first name for student " + (i + 1) + ": ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last name for student " + (i + 1) + ": ");
            String lastName = scanner.nextLine();
            students.add(new StuName(firstName, lastName));
        }


        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (StuName student : students) {
                writer.println(student.toString());
            }
            System.out.println("Student data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            return;
        }

       
        System.out.println("Class Roster:");
        for (StuName student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}