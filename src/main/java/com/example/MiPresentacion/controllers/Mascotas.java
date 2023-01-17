package com.example.MiPresentacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mascotas {

    @GetMapping("/mascotas")
    public String mascotas(){
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
                    background: linear-gradient(#62997a, #c6d1a6);
                }
                .contenedor{
                    margin: 50px auto;
                    width: 400px;
                    padding: 30px;
                    background: rgba(0,0,0, .5);
                    border-radius: 10px;
                    border-radius: 10px;
                }
                 .contenedor h1{
                    margin: 0px 0px 30px;
                    padding: 0px;
                    font-size: 30px;
                    color: #1ea49d;
                    text-align: center;
                }
                .contenedor h2{
                    margin: 0px 0px 30px;
                    padding: 0px;
                    font-size: 20px;
                    color: #88c3b5;
                    text-align: left;
                }
                .contenedor .elemento label {
                    color: white;
                }
                .contenedor .elemento a{
                    width: 100%;
                    padding: 10px 0px;
                    color:#7a6f5d;
                    background: transparent;
                    border: none;
                    border-bottom: 1px solid #fff;
                    margin-bottom: 30px;
                }
                .contenedor .elemento a[type="submit"]{
                    background-color: #f0d399;
                    border: none;
                    letter-spacing: 5px;
                    cursor: pointer;
                    padding: 10px;
                    margin-top: 25px;
                }
                   </style>
                </head>
                <body>
                <div class="contenedor">
                    <h1>Historia de mis mascotas</h1>
                    <h2>Miku</h2>
          
                        <div class="elemento">
                            <label for="Historia">Miku es el gato de mi novio</label
                        </div>
                        <div class="elemento">
                            <label for="historia"> Tiene 14 años. Originalmente era de la abuela 
                            de mi pareja pero al fallecer quedo con el. 
                            </label>
                        </div>
                        <div class="elemento">
                            <label for="Historia">Es un gato tranquilo, le gusta dormir mucho. </label
                        </div>
                        <div class="elemento">
                            <label for="Historia">Raza: Siames</label
                        </div>
                     
                     <br>
                     <br>
                     <br>
                     
                     <h2>Nami</h2>
                       <div class="elemento">
                            <label for="Historia">Nami fue encontrada por mi familia en la calle el año pasado</label
                        </div>
                        <div class="elemento">
                            <label for="historia"> Mi familia nos pregunto si la queriamos ya que en ese momento ellos 
                            vivian con mis perras. Dijimos que si.
                            </label>
                        </div>
                        <div class="elemento">
                            <label for="Historia">La gata esta loca</label
                        </div>
                        <div class="elemento">
                            <label for="Historia">Se llama asi por un personaje de One Piece. Roba corazones</label
                        </div>
                        <div class="elemento">
                            <label for="Historia">Raza: Tabi</label
                        </div>
                        
                        <br>
                        <br>
                        <br>
                         <br>
                        <br>
                        <br>
                        </div>
                        <div class="elemento">
                            <a href ="https://www.instagram.com/p/CnhoEU5p7Xz/" type ="submit" class ="boton">Ver Michis</a>
                        </div>
                  
                    </form>
                </div>
                </body>
                </html>
                 """;

        }

    }

