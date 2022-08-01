package com.MyPortfolio.MyBackSB.security.repository;

import com.MyPortfolio.MyBackSB.security.entity.Rol;
import com.MyPortfolio.MyBackSB.security.entity.Usuario;
import com.MyPortfolio.MyBackSB.security.enumerado.RolNombre;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository <Rol, Integer>{

    Optional<Rol> findByRolNombre(RolNombre rolNombre);


}
