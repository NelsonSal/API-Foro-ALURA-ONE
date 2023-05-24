package com.one.foroApi.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
		@NotBlank
		String titulo,
		@NotBlank
		String mensaje,
		@NotNull
		Usuario autor,
		@NotNull
		Curso curso
		) {
	



}



