 
package com.MyPortfolio.MyBackSB.controller;

import com.MyPortfolio.MyBackSB.model.Persona;

import com.MyPortfolio.MyBackSB.service.IPersonaService;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
  //meter los metodos y funciones con sus correspondientes anotations 
  // ej: @GetMapping ("/hola") con el path de la pagina donde reabrimos la API
    List<Persona> listaPersonas = new ArrayList();
   
    @Autowired 
    
    private IPersonaService persoServ; 
    
    //para enviar una entidad a un recurso 
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){

      persoServ.crearPersona(pers);
    }
    //el metodo get arroja un JSON, que el cliente no puede leer sino sabe Java
     
    @GetMapping ("/ver/personas")
    // entonces uso el response boby par meter una respuesta entendible
    @ResponseBody
    public List<Persona> verPersonas(){

      return persoServ.verPersona();
    }
    
    @DeleteMapping ("/delete/{id} ")
    public void borrarPersona( @PathVariable Long id) {

      persoServ.borrarPersona(id);
    }
     
      // put literalmente reemplaza los valores d la BD
    @PutMapping ("/put/persona")
     public void reemplazarPersona (@RequestBody Persona pers){
          
     }
    
}
