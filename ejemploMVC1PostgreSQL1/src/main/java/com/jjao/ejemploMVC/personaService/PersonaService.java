package com.jjao.ejemploMVC.personaService;

import com.jjao.ejemploMVC.personaEntitys.ListaPersonas;
import com.jjao.ejemploMVC.personaEntitys.Persona;
import com.jjao.ejemploMVC.personarepository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private PersonaRepository repository;
    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public List<Persona> getLstPersonas (){

        return this.repository.findAll();
    }
}
