/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyPortfolio.MyBackSB.controller;

import com.MyPortfolio.MyBackSB.model.Experiencia;
import com.MyPortfolio.MyBackSB.service.IExperienciaService;
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

/**
 *
 * @author Juli
 */
public class ExperienciaController {
    List<Experiencia> listaExperiencias = new ArrayList();
    
    @Autowired
    private IExperienciaService expeServ;
    
    @PostMapping ("/new/experiencia")
  
    public void agregarExperiencia(@RequestBody Experiencia expe){

      expeServ.crearExperiencia(expe);
    }
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){

      return expeServ.verExperiencia() ;
    }
    @PutMapping ("/put/experiencia")
     //public void reemplazarExperiencia (@RequestBody Experiencia expe)}
        
    @DeleteMapping ("/delete/{id} ")
    public void borrarExperiencia( @PathVariable Long id) {

      expeServ.borrarExperiencia(id);
    }  
    
     @PutMapping ("/put/experiencia")
     public void reemplazarExperiencia (@RequestBody Experiencia expe){
          
     }
}
