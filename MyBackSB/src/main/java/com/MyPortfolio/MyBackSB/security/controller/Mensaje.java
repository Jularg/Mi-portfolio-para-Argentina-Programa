package com.MyPortfolio.MyBackSB.security.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
   private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
