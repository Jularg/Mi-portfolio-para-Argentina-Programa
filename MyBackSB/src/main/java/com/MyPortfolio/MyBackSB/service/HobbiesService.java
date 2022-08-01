
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Hobbies;
import com.MyPortfolio.MyBackSB.repository.HobbiesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService implements IHobbiesServices {
@Autowired

public  HobbiesRepository hobiRepo;

    @Override
    public List<Hobbies> verHobbies() {
     return hobiRepo.findAll();
    }

    @Override
    public void crearHobby(Hobbies hob) {
       hobiRepo.save(hob);
    }

    @Override
    public void borrarHobby(Long id) {
       hobiRepo.deleteById(id);
    }

    @Override
    public Hobbies buscarHobby(Long id) {
        return hobiRepo.findById(id).orElse(null);
    }
    
}
