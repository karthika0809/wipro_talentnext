package IOquestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IOquestion3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args[1];
        
        // Use TreeMap for case-insensitive alphabetical ordering
        Map<String, Integer> wordCount = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split line into words (using non-word characters as delimiters)
                String[] words = line.trim().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Update word count
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            
            // Write results to output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    writer.write(entry.getKey() + " : " + entry.getValue());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}