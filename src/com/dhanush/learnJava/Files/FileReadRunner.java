package src.com.dhanush.learnJava.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("./JavaNotes.txt");
        /*
            This gives out the result in the form of List of String, which is
             not compatible for large files
         */
        System.out.println(Files.readAllLines(pathFileToRead));
        /*
            This reads the file in a stream and give the result as it is present
         */
        Files.lines(pathFileToRead).forEach(System.out::println);

    }
}
