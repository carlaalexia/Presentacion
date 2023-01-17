package com.example.MiPresentacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Info {


    @GetMapping("/info")
    public String info(){

        return """
                <!DOCTYPE html>
                <html>
                  <head>
                    <style>
                      html{
                         height: 100%;
                      }
                      body{
                          margin: 0;
                          padding: 0;
                          background: linear-gradient(#e5f3ba, #f6f1de);
                      }
                      .contenedor{
                          margin: 50px auto;
                          width: 400px;
                          padding: 100px;
                          background: rgba(0,0,0, .5);
                          border-radius: 10px;
                          border-radius: 10px;
                      }
                      .contenedor h2{
                          margin: 0px 0px 30px;
                          padding: 0px;
                          font-size: 30px;
                          color: #c6d1a6;
                          text-align: ;
                      }
                      .contenedor .elemento label {
                          color: white;
                          font-size: 20px;
                      }
              
                      
                    </style>
                  </head>
                  <body>
                    <div class="contenedor">
                        <h2>Carla Alexia Marquez</h2>
                       
                            <div class="elemento">
                                <label for="nacimiento">Nacimiento: Buenos aires</label>   
                            </div>
                            <div class="elemento">
                                <label for="edad">Edad: 26 </label>
                            </div>
                           
                            <div class="elemento">
                                <label for="Fecha">Fecha de nacimiento: 15/08/1996</label>
                            </div>
                            <div class="elemento">
                                <label for="Signo">Signo solar: Leo</label>
                            </div>
                            <div class="elemento">
                                <label for="Altura">Altura: 1,66 m</label>
                            </div>
                        </form>
                    </div>
                  </body>
                </html>
                """;
    }
}
