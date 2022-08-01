
package com.MyPortfolio.MyBackSB.controller;

import com.MyPortfolio.MyBackSB.model.Estudio;
import com.MyPortfolio.MyBackSB.service.IEstudioService;
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


public class EstudioController {
 List<Estudio> listaEstudios = new ArrayList();
 
   @Autowired
    public IEstudioService estuServ;
    
    @PostMapping ("/new/estudio")
    public void agregarEstudio(@RequestBody Estudio estu){

      estuServ.crearEstudio(estu);
    }
    
    @GetMapping ("/ver/estudio")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estuServ.verEstudio() ;
    }
    
    @DeleteMapping ("/delete/{id} ")
    public void borrarEstudio( @PathVariable Long id) {
      estuServ.borrarEstudio(id);
    } 
    @PutMapping ("/put/estudio")
     public void reemplazarEstudio (@RequestBody Estudio estu){
          
     }
      
}
