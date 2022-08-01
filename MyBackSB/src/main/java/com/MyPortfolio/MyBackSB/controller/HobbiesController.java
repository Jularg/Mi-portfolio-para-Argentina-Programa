
package com.MyPortfolio.MyBackSB.controller;

import com.MyPortfolio.MyBackSB.model.Hobbies;
import com.MyPortfolio.MyBackSB.service.IHobbiesServices;
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


public class HobbiesController {
    
       
    List<Hobbies> listaHobbies = new ArrayList();
    
    @Autowired 
    
    public IHobbiesServices hobiServ;
    
    @PostMapping ("/new/hobbies")
    public void agregarHobby(@RequestBody Hobbies hob){
        hobiServ.crearHobby(hob);  
    }
    
    @GetMapping ("/ver/hobbies")
    @ResponseBody
    public List<Hobbies> verHobbies(){
        return hobiServ.verHobbies();
    }
    
    @DeleteMapping ("/delete/{id} ")
    public void borrarHobby( @PathVariable Long id) {
      hobiServ.borrarHobby(id);
    }
     
      @PutMapping ("/put/hobbies")
     public void reemplazarHobby (@RequestBody Hobbies hob){
          
     }
    
}
