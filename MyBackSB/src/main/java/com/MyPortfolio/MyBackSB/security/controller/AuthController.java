package com.MyPortfolio.MyBackSB.security.controller;

import com.MyPortfolio.MyBackSB.security.dto.JwtDTO;
import com.MyPortfolio.MyBackSB.security.dto.NuevoUsuarioDTO;
import com.MyPortfolio.MyBackSB.security.entity.Rol;
import com.MyPortfolio.MyBackSB.security.entity.Usuario;
import com.MyPortfolio.MyBackSB.security.enumerado.RolNombre;
import com.MyPortfolio.MyBackSB.security.jwt.JwtProvider;
import com.MyPortfolio.MyBackSB.security.service.RolService;
import com.MyPortfolio.MyBackSB.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping ("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    JwtProvider jwtProvider;
    @Autowired
    RolService rolService;

    public ResponseEntity<?> nuevo (@Validated @RequestBody  NuevoUsuarioDTO nuevoUsuarioDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos mal puestos o email invalido"), HttpStatus.BAD_REQUEST);
        if (usuarioService.exitsByEmail(nuevoUsuarioDTO.getNombreUsuario()))
            return new ResponseEntity(new Mensaje("Ese usuario ya existe"), HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(nuevoUsuarioDTO.getNombre(), nuevoUsuarioDTO.getNombreUsuario(), nuevoUsuarioDTO.getEmail(), nuevoUsuarioDTO.getPassword(),
                passwordEncoder.encode(nuevoUsuarioDTO.getPassword()));

        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER.getDeclaringClass(roles)));
        if (nuevoUsuarioDTO.getRoles().contains("Admin"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).getRolNombre(roles);
        usuario.setRoles(roles);
        usuarioService.saveUsuario(usuario);
        return new ResponseEntity(new Mensaje("Usuario guardado"), HttpStatus.CREATED);
    }
    @PostMapping ("/login")
 public  ResponseEntity<JwtDTO> login (@Validated @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult  ){
        if (bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Usuario invalido"), HttpStatus.BAD_REQUEST);
     Authentication authentication=
             authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));
     SecurityContextHolder.getContext().setAuthentication(authentication);
     String jwt = jwtProvider.generateToken(authentication);
     UserDetails userDetails = (UserDetails) authentication.getPrincipal();
     JwtDTO jwtDTO = new JwtDTO(jwt, userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
             return new ResponseEntity(jwtDTO, HttpStatus.OK);
    }
}
