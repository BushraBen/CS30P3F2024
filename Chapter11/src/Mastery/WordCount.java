package Mastery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter11\\src\\Mastery\\source.txt";
        int wordCount = 0;
        int totalCharacters = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordCount++;
                        totalCharacters += word.length();
                    }
                }
            }

            if (wordCount > 0) {
                int averageWordLength = totalCharacters / wordCount;
                System.out.println("Number of words: " + wordCount);
                System.out.println("Average word length: " + averageWordLength);
            } else {
                System.out.println("No words found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
            System.err.println("Please make sure the file exists in the same directory as this program.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
