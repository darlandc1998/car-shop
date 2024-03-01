package com.carshop.app.infrastructure.authentication.filters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;


import com.carshop.app.infrastructure.authentication.configurations.SecurityConfig;
import com.carshop.app.infrastructure.authentication.models.AuthorizationData;
import com.carshop.app.infrastructure.authentication.models.JWTObject;
import com.carshop.app.infrastructure.authentication.services.JWTCreator;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.lang.Collections;

public class JWTFilter extends GenericFilterBean {



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        final String token = ((HttpServletRequest) request).getHeader(JWTCreator.HEADER_AUTHORIZATION);
        try {
            if (Objects.nonNull(token) && !token.isEmpty()) {
                final JWTObject tokenObject = JWTCreator.create(token, SecurityConfig.PREFIX, SecurityConfig.KEY);
                final AuthorizationData data = new AuthorizationData(tokenObject.getUserId(), tokenObject.getCustomerId(), tokenObject.getSubject());
                final List<SimpleGrantedAuthority> authorities = authorities(tokenObject.getRoles());
                final UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(data, null, authorities);
                SecurityContextHolder.getContext().setAuthentication(userToken);
            } else {
                SecurityContextHolder.clearContext();
            }
            filterChain.doFilter(request, response);
        } catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException | SignatureException e) {
            e.printStackTrace();
            ((HttpServletResponse) response).setStatus(HttpStatus.FORBIDDEN.value());
            return;
        }
    }

    private List<SimpleGrantedAuthority> authorities(List<String> roles) {
        if (Collections.isEmpty(roles)) {
            return new ArrayList<>();
        }
        return roles
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
