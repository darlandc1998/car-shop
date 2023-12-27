package com.carshop.app.authentication.services;

import java.util.List;
import java.util.stream.Collectors;

import com.carshop.app.authentication.enums.ClaimEnum;
import com.carshop.app.authentication.models.JWTObject;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;

public class JWTCreator {

    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(final String prefix, String key, JWTObject jwtObject) {
        final Claims claims = Jwts.claims().setSubject(jwtObject.getSubject());
        claims.put(ClaimEnum.USER_ID.getKey(), jwtObject.getUserId());
        claims.put(ClaimEnum.CUSTOMER_ID.getKey(), jwtObject.getCustomerId());
        claims.put(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles()));

        String token = Jwts
                .builder()
                .setIssuedAt(jwtObject.getIssuedAt())
                .setExpiration(jwtObject.getExpiration())
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();

        return prefix + " " + token;
    }

    public static JWTObject create(String token, String prefix, String key) throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException {
        final JWTObject object = new JWTObject();
        token = token.replace(prefix, "");
        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        object.setSubject(claims.getSubject());
        object.setExpiration(claims.getExpiration());
        object.setIssuedAt(claims.getIssuedAt());
        object.setRoles((List<String>) claims.get(ROLES_AUTHORITIES));
        object.setUserId((Integer) claims.get(ClaimEnum.USER_ID.getKey()));
        object.setCustomerId((Integer) claims.get(ClaimEnum.CUSTOMER_ID.getKey()));
        return object;
    }

    private static List<String> checkRoles(List<String> roles) {
        return roles.stream().map(s -> "ROLE_".concat(s.replaceAll("ROLE_", ""))).collect(Collectors.toList());
    }

}
