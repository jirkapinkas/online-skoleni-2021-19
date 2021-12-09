package com.example.eshopweb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainReadFile {

    public static void main(String[] args) throws IOException {
        // SPATNE!!!
        Files.lines(Paths.get("pom.xml"))
                .forEach(System.out::println);

        // SPRAVNE!!!
        try (Stream<String> stream = Files.lines(Paths.get("pom.xml"))) {
            stream.forEach(System.out::println);
        }
    }

}
