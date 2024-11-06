package MasteryUEmployeeFacultyStaff;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Create a Faculty object
        Faculty faculty = new Faculty(name, 75000, "Computer Science");

        // Create a Staff object
        Staff staff = new Staff(name, 50000, "Administrative Assistant");

        // Display information
        System.out.println("Faculty Information:");
        System.out.println("Name: " + faculty.getName());
        System.out.println("Salary: $" + faculty.getSalary());
        System.out.println("Department: " + faculty.getDepartmentName());

        System.out.println("Staff Information:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Salary: $" + staff.getSalary());
        System.out.println("Job Title: " + staff.getJobTitle());

        scanner.close();
    }
}