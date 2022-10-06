package com.example.practicaOauth2.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RutaLogin {
    RequestMapping("/")
        public String Ruta01(){
        return "Ingreso autorizado, Graciasle ha reconocido existosamente";

    }
}
