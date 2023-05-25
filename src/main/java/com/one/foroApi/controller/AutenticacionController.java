package com.one.foroApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.foroApi.modelo.acceso.DatosAutenticacionUsuario;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping
	public ResponseEntity autenticarUsuario(@RequestBody DatosAutenticacionUsuario datosAutenticacionUsuario) {
		Authentication token= new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(), 
				datosAutenticacionUsuario.clave());
		authenticationManager.authenticate(token);
		return ResponseEntity.ok().build();
		
	}
   

}
