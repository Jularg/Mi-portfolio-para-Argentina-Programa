package com.MyPortfolio.MyBackSB.security.controller;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class LoginUsuario {
    private String nombre;
    private  String apellido;
    private  String nombreUsuario;
    private  String email;
    private  String password;

    public LoginUsuario(String nombre, String apellido, String nombreUsuario, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }
}
