package com.example.MiPresentacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Receta {

    @GetMapping("/receta")
    public String receta(){
        return "receta";

    }
}
