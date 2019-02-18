package com.amisoft.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{name}")
    String userByName(@PathVariable String name){

        return "User :"+ name;
    }
}
