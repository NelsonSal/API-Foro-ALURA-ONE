package com.one.foroApi.modelo;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(
		@NotBlank
		String nombre,
		@NotBlank
		String categoria) {

}
