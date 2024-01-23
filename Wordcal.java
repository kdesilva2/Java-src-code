
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class Wordcal {


public static void main(String[] args) throws IOException, FileNotFoundException {

//This is to read the file
    BufferedReader reader = new BufferedReader(new FileReader("lorem_ipsum.txt"));

    String line;
    int wordCount = 0;
    int charCount= 0;
   

 while ((line = reader.readLine()) != null) {
 // Split the line into words using space as a delimiter
              String[] words = line.split("\\s+");
// Increment word count by the number of words in the line
              wordCount += words.length;

              //This is to count the number of characters without puncation and spaces
 for (int i = 0; i < line.length(); i++) {
    char current = line.charAt(i);

        if (current!= ' ' && current != ',' && current != '.'){

             charCount++; 
         }
    }
              
}
//This prints out the total amount of words in the text file
System.out.println("There are "+ wordCount + " words in the text file");


// This prints out the total number of characters excluding punctuation
System.out.println("There are "+ charCount + " characters in the text file");

// This converts the file size
 String filePath = "lorem_ipsum.txt";
     File file = new File(filePath);
     if (file.exists()) {
        // Get the size of the file in bytes
        long fileSize = file.length();

        // Convert bytes to kilobytes 
        double fileSizeKB = fileSize / 1024.0;

        // Convert kilobytes to megabytes 
        double fileSizeMB = fileSizeKB / 1024.0;

        System.out.println("The size of the file is " + fileSizeMB + " MB");
     }








reader.close();

}
}

