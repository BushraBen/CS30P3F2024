package Mastery;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Prompt user for search word or phrase
        System.out.print("Enter the search word or phrase: ");
        String searchPhrase = scanner.nextLine();

        // Prompt user for replacement word/phrase
        System.out.print("Enter the replacement word or phrase: ");
        String replacementPhrase = scanner.nextLine();

        try {
            // Read file content
            String content = new String(Files.readAllBytes(Paths.get(fileName)));

            // Perform the find & replace operation
            String updatedContent = content.replaceAll(searchPhrase, replacementPhrase);

           
            Files.write(Paths.get(fileName), updatedContent.getBytes());

            System.out.println("Find and replace operation completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}