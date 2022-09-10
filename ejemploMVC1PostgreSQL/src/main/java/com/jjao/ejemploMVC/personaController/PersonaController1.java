package com.jjao.ejemploMVC.personaController;

import com.jjao.ejemploMVC.personaEntitys.ListaPersonas;
import com.jjao.ejemploMVC.personaEntitys.Persona;
import com.jjao.ejemploMVC.personaService.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class PersonaController1 {
    private PersonaService service;

    public PersonaController1() {
        this.service = new PersonaService();
    }

    @GetMapping("/lista")
    public ListaPersonas listaPersonas (){
       return this.service.getLstPersonas();
    }
}
