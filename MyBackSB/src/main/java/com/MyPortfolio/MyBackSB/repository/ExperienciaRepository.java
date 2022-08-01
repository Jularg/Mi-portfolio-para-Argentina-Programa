
package com.MyPortfolio.MyBackSB.repository;

import com.MyPortfolio.MyBackSB.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//DAO esto reemplaza a todas las clases controlodoras de la logica 
// una interfaz que tiene todos los metodos incorporados en JpaRepository
@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}

