package com.one.foroApi.modelo;

public record DatosActualizarTopico(
		Long id,
		String titulo,
		String mensaje,
		Usuario autor,
		Curso curso
		) {
	

}



