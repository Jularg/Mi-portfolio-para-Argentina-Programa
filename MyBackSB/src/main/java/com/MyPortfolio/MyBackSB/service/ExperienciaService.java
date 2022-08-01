
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Experiencia;
import com.MyPortfolio.MyBackSB.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired 
     public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencia() {
      return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }
    
    //public void reemplazarExperiencia (Experiencia expe){
        //expeRepo.save(expe);
    //}
}
