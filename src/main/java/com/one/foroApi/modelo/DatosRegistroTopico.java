package com.one.foroApi.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public record DatosRegistroTopico(
		String titulo,
		String mensaje,
		LocalDateTime fechaCreacion,
		StatusTopico status,
		Usuario autor,
		Curso curso
		) {
	



}



