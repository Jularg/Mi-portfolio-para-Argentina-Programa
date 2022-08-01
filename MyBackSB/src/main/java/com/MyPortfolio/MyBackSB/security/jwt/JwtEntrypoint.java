package com.MyPortfolio.MyBackSB.security.jwt;
//comprueba si hay un token, sino devielve 401

import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@Component
public class JwtEntrypoint implements AuthenticationEntryPoint {
    private final static Logger logger = (Logger) LoggerFactory.getLogger(JwtEntrypoint.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        logger.warning ("fail en el metodo commence");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Acceso no autorizado");
    }
}
