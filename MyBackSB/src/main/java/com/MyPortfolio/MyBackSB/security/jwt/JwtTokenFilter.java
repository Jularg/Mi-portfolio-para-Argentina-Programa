package com.MyPortfolio.MyBackSB.security.jwt;
// se ejecuta con cada peticion

import com.MyPortfolio.MyBackSB.security.service.UserDetailsService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class JwtTokenFilter extends OncePerRequestFilter {
    private final static Logger logger = (Logger) LoggerFactory.getLogger(JwtTokenFilter.class);
    @Autowired
   JwtProvider jwtProvider;
    UserDetailsService userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
           String token = getToken(request);
           if (token !=null &&jwtProvider.validationToken(token)){
               String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
               UserDetails userDetails = userDetailsService.loadUserByUsername(nombreUsuario);
               UsernamePasswordAuthenticationToken auth= new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
               SecurityContextHolder.getContext().setAuthentication(auth);
           }
        } catch (Exception e) {
            logger.warning("fail en el metodo doFilter");
        }
          filterChain.doFilter(request,response);
    }
    private String getToken(HttpServletRequest request){
        String header = request.getHeader("Authorization");
        if (header!= null && header.startsWith("Bearer"))
            return header.replace("Bearer","");
        return null;
    }
}
