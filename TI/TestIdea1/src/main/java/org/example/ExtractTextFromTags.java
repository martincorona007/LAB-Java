package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTextFromTags {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "src/main/java/org/example/testting1.txt";

        try {
            // Read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Regular expression to match text inside {{c1::...}} tags
            Pattern pattern = Pattern.compile("\\{\\{c1::(.*?)}}");

            // Iterate through each line in the file
            while ((line = reader.readLine()) != null) {
                StringBuilder result = new StringBuilder();

                // Use a Matcher to find matches in the current line
                Matcher matcher = pattern.matcher(line);

                // Iterate through matches in the line
                while (matcher.find()) {
                    // Append the matched text to the result
                    result.append(matcher.group(1)).append(" ");
                }

                // Print the result for the current line
                System.out.println(result.toString().trim());

                // If the line ends with a period, move to a new line
                if (line.endsWith(".")) {
                   // System.out.println();  // Move to a new line
                }
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
