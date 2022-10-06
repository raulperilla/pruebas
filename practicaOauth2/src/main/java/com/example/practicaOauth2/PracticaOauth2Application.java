package com.example.practicaOauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@SpringBootApplication
public class PracticaOauth2Application {
	@RequestMapping("/")
	Spring LoadPage(){
		return "Mensje de salida servidor local";
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticaOauth2Application.class, args);
		System. out. print ( "Prueba de aplicacion") ;
	}

}
