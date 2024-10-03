package SkillBuilder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();

        System.out.print("Do you want to read from an existing file? (yes/no): ");
        boolean readExisting = scanner.nextLine().startsWith("y");

        String fileName;
        if (readExisting) {
            System.out.print("Enter the name of the existing file: ");
            fileName = scanner.nextLine();
            readFile(fileName, names, scores);
        } else {
            System.out.print("Enter the name of the file to create: ");
            fileName = scanner.nextLine();
            getUserInput(scanner, names, scores);
            writeFile(fileName, names, scores);
        }

        displayData(names, scores);
        displayStats(scores);

        scanner.close();
    }

    private static void getUserInput(Scanner scanner, List<String> names, List<Integer> scores) {
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            names.add(scanner.nextLine());
            System.out.print("Enter student score: ");
            scores.add(scanner.nextInt());
            scanner.nextLine(); 
        }
    }

    private static void readFile(String fileName, List<String> names, List<Integer> scores) {
        try (BufferedReader Br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = Br.readLine()) != null) {
                names.add(line);
                scores.add(Integer.parseInt(Br.readLine()));
            }
        } catch (IOException o) {
            System.out.println("Error reading the file: " + o.getMessage());
            System.exit(1);
        }
    }

    private static void writeFile(String fileName, List<String> names, List<Integer> scores) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < names.size(); i++) {
                writer.println(names.get(i));
                writer.println(scores.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void displayData(List<String> names, List<Integer> scores) {
        System.out.println("Student Names and Scores:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + scores.get(i));
        }
    }

    private static void displayStats(List<Integer> scores) {
        int lowestScore = scores.stream().mapToInt(Integer::intValue).min().orElse(0);
        int highestScore = scores.stream().mapToInt(Integer::intValue).max().orElse(0);
        double averageScore = scores.stream().mapToInt(Integer::intValue).average().orElse(0);
        
       double roundedAverage = (double) Math.round(averageScore * 100) / 100;
       
       	
        System.out.println("Statistics:");
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Average Score: " + roundedAverage);
    }

    
}