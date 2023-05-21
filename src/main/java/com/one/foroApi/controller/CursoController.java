package com.one.foroApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.foroApi.Repository.CursoRepository;
import com.one.foroApi.modelo.Curso;
import com.one.foroApi.modelo.DatosRegistroCurso;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	@Autowired
	private CursoRepository cursoRepository;
	
	
	@PostMapping
	public void registrarCurso(@RequestBody DatosRegistroCurso datosRegistroCurso) {
		cursoRepository.save(new Curso(datosRegistroCurso));
		
	}

}
