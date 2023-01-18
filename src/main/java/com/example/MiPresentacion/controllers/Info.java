package com.example.MiPresentacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Info {


    @GetMapping("/info")
    public String info(){

        return "info";
    }
}
