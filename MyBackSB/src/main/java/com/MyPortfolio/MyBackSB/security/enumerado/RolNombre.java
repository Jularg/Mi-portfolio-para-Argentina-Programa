package com.MyPortfolio.MyBackSB.security.enumerado;

import com.MyPortfolio.MyBackSB.security.entity.Rol;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter @Setter
public enum RolNombre {
    ROLE_ADMIN, ROLE_USER;

    RolNombre() {
    }
    /// tengo que hacer todo el if
    public RolNombre getDeclaringClass(Set<Rol> roles) {

    }
}
