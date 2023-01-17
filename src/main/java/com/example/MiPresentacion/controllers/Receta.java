package com.example.MiPresentacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Receta {

    @GetMapping("/receta")
    public String receta(){
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
                        background: linear-gradient(#eb9c4d, #f2d680);
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
                        color: #f3ffcf;
                        text-align: center;
                    }
                    .contenedor h3{
                        margin: 0px 0px 30px;
                        padding: 0px;
                        font-size: 20px;
                        color: #feffd4;
                        text-align: left;
                    }
                    .contenedor .elemento label {
                        color: white;
                    }
                 
                    </style>
                </head>
                <body>
                <div class="contenedor">
                    <h2>Galletitas de limon</h2>
                    <h3>Lista de ingredientes</h3>
                        <div class="elemento">
                            <label for="ingrediente">Harina leudante 250 gr</label>
                        </div>
                        <div class="elemento">
                            <label for="ingrediente">Azucar 100gr</label>
                        </div>
                        <div class="elemento">
                            <label for="ingrediente">Aceite 65 ml</label>
                        </div>
                        <div class="elemento">
                            <label for="ingrediente">Escencia de vainilla</label>
                        </div>
                        <div class="elemento">
                            <label for="ingrediente">Huevo 1u</label>
                        </div>
                        <div class="elemento">
                            <label for="ingrediente">Limon 1u</label>
                        </div>
                        <br>
                        <br>
                        <br>
                        <h3>Preparacion</h3>
                        <div class="elemento">
                            <label for="pasos">1. En un bowl poner un huevo y el azucar. Mezclar </label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">2. Agregar el aceita y una cucharadita de escencia de vainilla.</label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">3. Agregar rayadura de limon y exprimir medio. Batir </label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">4. Agregar la harina. Mezclar </label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">5. Hacer un bollo y guardarlo en una bolsa</label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">6. Llevar una hora a la heladera </label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">7. Estirar la masa y hacer formas</label>
                        </div>
                        <div class="elemento">
                            <label for="pasos">8. 15 minutos en horno precalentado</label>
                        </div>
               
                   
                </div>
                </body>
                </html>
                """;

    }
}
