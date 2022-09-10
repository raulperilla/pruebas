package com.jjao.ejemploMVC.personarepository;

import com.jjao.ejemploMVC.personaEntitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Long> {

}
