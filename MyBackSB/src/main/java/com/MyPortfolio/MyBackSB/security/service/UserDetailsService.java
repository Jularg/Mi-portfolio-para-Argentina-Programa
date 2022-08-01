package com.MyPortfolio.MyBackSB.security.service;

import com.MyPortfolio.MyBackSB.security.entity.Usuario;
import com.MyPortfolio.MyBackSB.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    UsuarioService usuarioServ;
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioServ.buscarUsuario(Long.valueOf(nombreUsuario));
        return UsuarioPrincipal.build(usuario);
    }
}
