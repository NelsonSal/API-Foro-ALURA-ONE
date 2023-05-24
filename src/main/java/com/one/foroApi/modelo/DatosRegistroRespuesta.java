package com.one.foroApi.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroRespuesta(
		@NotBlank
		String mensaje,
		@NotNull
		Topico topico,
		@NotNull
		Usuario autor) {

}
