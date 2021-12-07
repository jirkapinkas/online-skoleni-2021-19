package com.example.eshopweb.controller;

import com.example.eshopweb.pojo.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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

    @GetMapping("/hello2")
    public void message(Locale locale, HttpSession session,
                           HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("low level shit");
    }

}
