package SkillBuilderAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Assignment {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter11\\src\\SkillBuilderAssignment\\Assignment_Instructions.txt";
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("File does not exist: " + file.getAbsolutePath());
            return;
            //
        }
        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            System.out.println("Assignment Instructions:");
            System.out.println("------------------------");
            
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        
    
    }
}