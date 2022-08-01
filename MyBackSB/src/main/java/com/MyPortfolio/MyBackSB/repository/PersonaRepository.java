
package com.MyPortfolio.MyBackSB.repository;

import com.MyPortfolio.MyBackSB.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {

   
    
}
