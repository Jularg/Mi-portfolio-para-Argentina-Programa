package com.MyPortfolio.MyBackSB.security.entity;



import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String nombre;
    @NonNull
    @Column (unique = true)
    private String nombreusuario;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    @ManyToMany
  @JoinTable (name= "usuario_rol", joinColumns = @JoinColumn (name = "usuario_id"),
  inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();

    public Usuario(String nombre, String nombreUsuario, String email, String password, String encode) {

    }

    public Usuario(@NonNull String nombre, @NonNull String nombreusuario, @NonNull String email, @NonNull String password) {
        this.nombre = nombre;
        this.nombreusuario = nombreusuario;
        this.email = email;
        this.password = password;
    }
}
