package src.com.dhanush.learnJava.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        /*
            NewTextFile.txt was not present before, we could directly give
            the path here, and it would create a new file in that path if not
             present. If its already present then its going to write over it
         */
        Path pathFileToWrite = Paths.get("./src/com/dhanush/learnJava/Files" +
                "/NewTextFile.txt");

        List list = List.of("Apple", "ball", "cat", "dog");

        /*
            passing the list of data to write over the file
         */
        Files.write(pathFileToWrite, list);

    }
}
