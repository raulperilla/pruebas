package com.jjao.ejemploMVC.personaService;

import com.jjao.ejemploMVC.personaEntitys.ListaPersonas;
import com.jjao.ejemploMVC.personaEntitys.Persona;

public class PersonaService {

    private Persona persona1;
    private Persona persona2;
    private Persona persona3;

    private ListaPersonas lstPersonas;


    public PersonaService() {
        this.persona1 = new Persona(1,"juan","acevedo","juanjoseaceved@gmail.com","3147459785");
        this.persona2 = new Persona(2,"andres","ospina","andres@gmail.com","367899785");
        this.persona3 = new Persona(3,"camilo","tamayo","camilo@gmail.com","3890029785");
        this.lstPersonas = new ListaPersonas();
        lstPersonas.agregarPersona(persona1);
        lstPersonas.agregarPersona(persona2);
        lstPersonas.agregarPersona(persona3);
    }

    public ListaPersonas getLstPersonas (){
        return this.lstPersonas;
    }
}
