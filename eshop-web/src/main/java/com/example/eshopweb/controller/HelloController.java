package com.example.eshopweb.controller;

import com.example.eshopweb.pojo.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public Message message() {
        return new Message("Spring Boot Rulez :-)");
    }

    // http://localhost:8080/hello?name=Jirka
    @GetMapping(path = "/hello", params = "name")
    public Message message(@RequestParam String name) {
        return new Message("Hello " + name + ", Spring Boot Rulez :-)");
    }

    // http://localhost:8080/hello2
    @GetMapping("/hello2")
    public void message(Locale locale, HttpSession session,
                           HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("low level shit");
    }

    // http://localhost:8080/bobik
    @GetMapping(path = "/bobik", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] bobik() throws IOException {
        return Files.readAllBytes(Paths.get("files", "bobik.jpg"));
    }

    // http://localhost:8080/file?name=bobik.jpg
    // http://localhost:8080/file?name=cica.jpg
    @GetMapping("/file")
    public ResponseEntity<Object> file(@RequestParam String name) throws IOException {
        Path path = Paths.get("files", name);
        if(!path.toFile().exists()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(new Message("File '" + name + "' was not found!"));
        }
        byte[] bytes = Files.readAllBytes(path);
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.IMAGE_JPEG)
                .body(bytes);
    }

}
