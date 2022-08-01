
package com.MyPortfolio.MyBackSB.repository;

import com.MyPortfolio.MyBackSB.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface HabilidadRepository extends JpaRepository <Habilidad, Long>  {
    
}
