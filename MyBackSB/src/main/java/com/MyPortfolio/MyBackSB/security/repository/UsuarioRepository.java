package com.MyPortfolio.MyBackSB.security.repository;

import com.MyPortfolio.MyBackSB.security.entity.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long >  {
    @Override
    Optional<Usuario> findById(Long aLong);
    boolean existsByNombreUsuario(String nombreUsuario);

    default boolean existsByEmail(String email) {
        return true;
    }
}
