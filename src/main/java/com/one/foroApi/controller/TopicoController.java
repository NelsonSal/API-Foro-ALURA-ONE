package com.one.foroApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.foroApi.Repository.TopicoRepository;
import com.one.foroApi.modelo.DatosRegistroTopico;
import com.one.foroApi.modelo.Topico;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
	@Autowired
	private TopicoRepository topicoRepository;
	
	@PostMapping
	public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
		System.out.println(datosRegistroTopico);
		topicoRepository.save(new Topico(datosRegistroTopico));
		
	}

}
