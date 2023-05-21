package com.one.foroApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		Topico topicoParaComparar = new Topico(datosRegistroTopico); 
		boolean existe = topicoRepository.existsByTituloAndMensaje(topicoParaComparar.getTitulo(),topicoParaComparar.getMensaje());
		System.out.println("Titulo existe= "+existe);
		System.out.println(datosRegistroTopico);
		if (!existe) {
			topicoRepository.save(new Topico(datosRegistroTopico));
			
		}else {
			System.out.println("Titulo y Mensaje ta existen");
		}
		
				
	}
	@GetMapping
	public List<Topico> listadoTopicos(){
		return topicoRepository.findAll();
	}
	
	
}
