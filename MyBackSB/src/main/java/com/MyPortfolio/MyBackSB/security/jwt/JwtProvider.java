package com.MyPortfolio.MyBackSB.security.jwt;
//genera el token y que este bien

import com.MyPortfolio.MyBackSB.security.entity.UsuarioPrincipal;
import io.jsonwebtoken.*;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.logging.Logger;

@Component
public class JwtProvider {
    private final static Logger logger = (Logger) LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}") //esto viene de aplication.properties
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;




    public JwtProvider(String secret, int expiration, String token) {
        this.secret = secret;
        this.expiration = expiration;

    }

    public String generateToken(Authentication authentication) {
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();

        return Jwts.builder().setSubject(usuarioPrincipal.getNombreUsuario())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public String getNombreUsuarioFromToken(String token) {

        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validationToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException exception) {
            logger.warning("Token mal formado");
        } catch (UnsupportedJwtException exception) {
            logger.warning("Token no soportado");
        } catch (ExpiredJwtException exception) {
            logger.warning("Token expirado");
        } catch (IllegalArgumentException exception) {
            logger.warning("Token vacío");
        } catch (SignatureException exception) {
            logger.warning("Error en la firma");
        }
        return false;
    }
}
