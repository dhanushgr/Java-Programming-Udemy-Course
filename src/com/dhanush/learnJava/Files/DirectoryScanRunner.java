package src.com.dhanush.learnJava.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {

        Path currentDirectory = Paths.get(".");
        //it gets all the directories in the current path
        Files.list(currentDirectory).forEach(System.out::println);
        //to walk to through the directory files with depth of our choice
        Files.walk(currentDirectory, 10)
                .filter(path -> String.valueOf(path).endsWith(".java"))
                .forEach(System.out::println);

    }
}
