package com.springboot.angular.controller;

import com.springboot.angular.model.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/api/basicauth")
public class BasicAuthController {

    @GetMapping
    public AuthenticationBean helloWorldBean(){
        return new AuthenticationBean("You are Authenticated!");
    }

}
