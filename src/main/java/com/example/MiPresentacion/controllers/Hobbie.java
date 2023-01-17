package com.example.MiPresentacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hobbie {

    @GetMapping("/hobbies")
    public String hobbies(){

        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <style>
                    html{
                       height: 100%;
                    }
                    body{
                        margin: 0;
                        padding: 0;
                        background: linear-gradient(#f7a29e, #f3c6b9);
                    }
                    .contenedor{
                        margin: 50px auto;
                        width: 400px;
                        padding: 30px;
                        background: rgba(0,0,0, .5);
                        border-radius: 10px;
                        border-radius: 10px;
                    }
                    .contenedor h2{
                        margin: 0px 0px 30px;
                        padding: 0px;
                        font-size: 30px;
                        color: #faeddf;
                        text-align: center;
                    }
                    .contenedor h3{
                        margin: 0px 0px 30px;
                        padding: 0px;
                        font-size: 20px;
                        color: #fcd0cf;
                        text-align: left;
                    }
                    .contenedor .elemento label {
                        color: white;
                    }
                 
                    </style>
                </head>
                <body>
                <div class="contenedor">
                    <h2>Hobbie: coleccionar mangas</h2>
                    <h3>Lista</h3>
                        <div class="elemento">
                            <label for="Hobbie">Paradise kiss</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Blood on the tracks</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">20th century boys</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Haikyuu</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Spyxfamily</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Jigokuraku</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Slam dunk</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Chainsawman</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Fire punch</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">One piece</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Hunterxhunter</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Wotakoi</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Given</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Blue period</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Jujutsu kaisen</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Soul eater</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Sakura card captor deluxe edition</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">One piece</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Kimetsu no yaiba</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Yuyu hakusho</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Dandadan</label>
                        </div>
                        <div class="elemento">
                            <label for="Hobbie">Oshi no ko</label>
                        </div>
               
                   
                </div>
                </body>
                </html>
                """;
    }
}
