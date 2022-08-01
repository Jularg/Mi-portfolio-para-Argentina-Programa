
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    public List <Habilidad> verHabilidad();
    
    public void crearHabilidad(Habilidad hab);
    
    public void borrarHabilidad (Long id);
    
    public Habilidad buscarHabilidad (Long id);
    
}
