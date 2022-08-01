
package com.MyPortfolio.MyBackSB.service;

import com.MyPortfolio.MyBackSB.model.Estudio;
import com.MyPortfolio.MyBackSB.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {
 @Autowired
 public EstudioRepository estuRepo;
    
 @Override
    public List<Estudio> verEstudio() {
     return estuRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio estu) {
     estuRepo.save(estu);
    }

    @Override
    public void borrarEstudio(Long id) {
       estuRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
       return estuRepo.findById(id).orElse(null);
    }
}

