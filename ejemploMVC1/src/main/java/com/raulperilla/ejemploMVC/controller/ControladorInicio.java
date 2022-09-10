package com.raulperilla.ejemploMVC.controller;

import com.raulperilla.ejemploMVC.dominio.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String iniciar(Model model){
        Persona persona1 = new Persona();
        persona1.setNombre("Raul");
        persona1.setApellido("Perilla");
        persona1.setTelefono("3002930069");
        persona1.setEmail("raulps1971@yahoo.com");

        Persona persona2 = new Persona();
        persona2.setNombre("Dulima");
        persona2.setApellido("Cerquera");
        persona2.setTelefono("3118607152");
        persona2.setEmail("dulimacerquera@yahoo.com");

        Persona persona3 = new Persona();
        persona3.setNombre("Jose");
        persona3.setApellido("Gonzalez");
        persona3.setTelefono("3000000000");
        persona3.setEmail("jose1971@yahoo.com");

        Persona persona4 = new Persona();
        persona4.setNombre("Ruben");
        persona4.setApellido("zapata moreno");
        persona4.setEmail("moreno@gmail.com");
        persona4.setTelefono("31567559785");

        Persona persona5 = new Persona();
        persona5.setNombre("valentina");
        persona5.setApellido("tamayo");
        persona5.setEmail("valen@gmail.com");
        persona5.setTelefono("3878659785");

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        model.addAttribute("personas", personas);
        return "index";

    }
}
