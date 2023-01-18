package com.example.MiPresentacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Hobbie {

    @GetMapping("/hobbies")
    public String hobbies(){

        return "hobbies";
    }
}
