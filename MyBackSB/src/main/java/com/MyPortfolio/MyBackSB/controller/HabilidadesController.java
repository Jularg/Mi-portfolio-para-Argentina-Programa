/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyPortfolio.MyBackSB.controller;

import com.MyPortfolio.MyBackSB.model.Habilidad;
import com.MyPortfolio.MyBackSB.service.IHabilidadService;
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
public class HabilidadesController {
    List<Habilidad> listaHabilidades = new ArrayList();
    
    @Autowired
    public IHabilidadService habiServ;
    
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad(@RequestBody Habilidad hab){
       habiServ.crearHabilidad(hab);   
    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidad> verHabilidades(){
    return habiServ.verHabilidad();
}
    
    @DeleteMapping ("/delete/{id} ")
    public void borrarHabilidad( @PathVariable Long id) {
      habiServ.borrarHabilidad(id);
    } 
    @PutMapping ("/put/habilidades")
     public void reemplazarHabilidad (@RequestBody Habilidad hab){
          
     }
    
}
