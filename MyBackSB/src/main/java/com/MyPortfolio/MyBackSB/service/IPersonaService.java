
package com.MyPortfolio.MyBackSB.service;

import com.MyPortfolio.MyBackSB.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
   // en un Service hacemos la declaracion de los metodos pero no lo implementamos, 
    //se implementan PersonaService 
    //metodos de un CRUD
    public List <Persona> verPersona();
    
    public void crearPersona(Persona pers);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);  //??
}
