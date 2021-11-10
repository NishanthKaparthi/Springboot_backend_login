package com.springboot.angular.controller;

import com.springboot.angular.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //http://localhost:8080/api/greeting?name=Nishanth
    //http:localhost:8080/api/greeting
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name" , defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
