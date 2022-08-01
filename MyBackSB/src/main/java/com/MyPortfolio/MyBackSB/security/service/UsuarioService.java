package com.MyPortfolio.MyBackSB.security.service;

import com.MyPortfolio.MyBackSB.security.entity.Usuario;
import com.MyPortfolio.MyBackSB.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
  @Autowired
    UsuarioRepository usuarioRepo;

  public Usuario buscarUsuario(Long id) {
    return usuarioRepo.findById(id).orElse(null);
  }

  public boolean exitsByEmail (String email) {
    return usuarioRepo.existsByEmail(email);
  }

 public void saveUsuario (Usuario nombreUsuario) {
    usuarioRepo.save(nombreUsuario);
 }

}
