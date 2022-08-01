
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Estudio;
import java.util.List;


public interface IEstudioService {
    public List <Estudio> verEstudio();
    
    public void crearEstudio(Estudio estu);
    
    public void borrarEstudio (Long id);
    
    public Estudio buscarEstudio (Long id);
    
}
