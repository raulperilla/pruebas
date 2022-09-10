package com.raulperilla.EjemplosVerbosHTTP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
@Slf4j
public class ControladorInicio {

    @GetMapping
    public String getPersona() {
        return "obteniendo datos de la Persona";
    }

    @PostMapping
    public String crearPersona() {
        return "crearPersona";
    }

    @PutMapping
    public String actualizarPersona() {
        return "actualizarPersonal";
    }

    @DeleteMapping
    public String borrarPersona() {
        return "borrarPersona";
    }

}
