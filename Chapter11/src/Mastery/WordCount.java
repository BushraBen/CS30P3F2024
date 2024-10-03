package Mastery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "source.txt";
        int wordCount = 0;
        int totalCharacters = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[^a-zA-Z]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                        totalCharacters += word.length();
                    }
                }
            }

            double averageWordLength = (double) totalCharacters / wordCount;

            System.out.println("Number of words: " + wordCount);
            System.out.printf("Average word length: %.2f characters%n", averageWordLength);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}