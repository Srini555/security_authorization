package com.amisoft.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(){
        return "Welcome to Amisoft !!!!";
    }

}
