package com.MyPortfolio.MyBackSB.security.dto;

import lombok.Getter;
import lombok.Setter;

import org.springframework.lang.NonNull;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter
public class NuevoUsuarioDTO {
    @NonNull
    private String nombre;

    private String nombreUsuario;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private Set<String> roles= new HashSet<>();

}
