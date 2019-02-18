package com.amisoft.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/rootone")
    public String rootone(){
        return "Welcome to Amisoft !!!! rootone";
    }

    @GetMapping("/roottwo")
    public String roottwo(){
        return "Welcome to Amisoft !!!! ROOT_TWO";
    }

    @GetMapping("/rootthree")
    public String rootthree(){
        return "Welcome to Amisoft !!!! ROOT_THREE";
    }
}
