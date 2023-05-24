package com.one.foroApi.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
		@NotBlank
		@NotNull
		Long id,
		String titulo,
		String mensaje,
		Usuario autor,
		Curso curso
		) {
	

}



