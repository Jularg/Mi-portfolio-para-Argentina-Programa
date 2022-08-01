package com.MyPortfolio.MyBackSB.security.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;
@Getter@Setter
public class LoginDTO {
    @NonNull
    private String nombreUsuario;
    @NonNull
    private String password;
}
