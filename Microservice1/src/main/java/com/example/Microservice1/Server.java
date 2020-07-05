package com.example.Microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server {
    @GetMapping("/name/{name}")
    public String hello(@PathVariable String name)
    {
        return "Hello "+name;
    }
}
