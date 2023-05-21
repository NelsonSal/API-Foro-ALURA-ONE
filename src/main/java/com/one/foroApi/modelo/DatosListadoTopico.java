package com.one.foroApi.modelo;

import java.time.LocalDateTime;

public record DatosListadoTopico(
				String titulo, 
				String mensaje, 
				LocalDateTime fechaCreacion,
				StatusTopico status, 
				String autor, 
				String curso) {
	public DatosListadoTopico(Topico topico) {
		this(topico.getTitulo(),topico.getMensaje(),topico.getFechaCreacion(),
				topico.getStatus(),topico.getAutor().getNombre(),topico.getCurso().getNombre());
	}

}
