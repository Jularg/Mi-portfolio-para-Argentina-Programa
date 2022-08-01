
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Habilidad;
import com.MyPortfolio.MyBackSB.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
@Autowired
 public HabilidadRepository habiRepo;
    @Override
    public List<Habilidad> verHabilidad() {
        return habiRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habiRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
      habiRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
      return habiRepo.findById(id).orElse(null);
    }
    
}
