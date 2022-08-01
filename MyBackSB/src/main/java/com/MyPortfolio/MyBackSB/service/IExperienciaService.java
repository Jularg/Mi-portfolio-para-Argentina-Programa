
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List <Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia expe);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);
     
   

   
    
}
