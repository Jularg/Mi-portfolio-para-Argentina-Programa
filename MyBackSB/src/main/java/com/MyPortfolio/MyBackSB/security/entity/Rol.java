package com.MyPortfolio.MyBackSB.security.entity;

import com.MyPortfolio.MyBackSB.security.enumerado.RolNombre;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Setter@Getter
public class Rol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private int id;
@NonNull
@Enumerated (EnumType.STRING)
    private RolNombre rolNombre;


    public Rol () {
    }
    public Rol (@NonNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }


}

