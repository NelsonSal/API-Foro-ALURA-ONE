package com.one.foroApi.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.one.foroApi.modelo.acceso.Acceso;



@Service
public class TokenService {
	@Value("${api.security.secret}")
    private String apiSecret;
	public String generarToken(Acceso acceso){
        try {
            Algorithm algorithm = Algorithm.HMAC256(apiSecret);//Var de ambiente set en las propiedades del proyecto
            return  JWT.create()
                    .withIssuer("curso alura")
                    
                    .withSubject(acceso.getLogin())
                    .withClaim("id", acceso.getID())
                    .withExpiresAt(generarFechaDeExpiracion())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException();
        }

	}
	
    private Instant generarFechaDeExpiracion(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-05:00"));
    }
}