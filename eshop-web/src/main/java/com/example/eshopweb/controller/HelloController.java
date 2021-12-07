package com.example.eshopweb.controller;

import com.example.eshopweb.pojo.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
