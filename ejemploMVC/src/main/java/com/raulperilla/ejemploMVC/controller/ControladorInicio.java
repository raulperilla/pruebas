package com.raulperilla.ejemploMVC.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
@Value("${index.saludo}")
private String saludo;
    @GetMapping("/")
    public String iniciar(Model model){
        log.info("ejecutando el controlador MVC ");

        String mensaje=" hola mundo con thymeleaf con Sprint Boot y Java";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);


        return "index";

    }
}
