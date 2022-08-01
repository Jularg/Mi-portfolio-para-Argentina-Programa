package com.MyPortfolio.MyBackSB.security.service;

import com.MyPortfolio.MyBackSB.security.entity.Rol;
import com.MyPortfolio.MyBackSB.security.enumerado.RolNombre;
import com.MyPortfolio.MyBackSB.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepo;


   public Rol getByRolNombre (RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
   }
}
