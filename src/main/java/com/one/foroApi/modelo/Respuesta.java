package com.one.foroApi.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity (name="Respuesta")
@Table(name="respuestas")
@EqualsAndHashCode(of="id")
public class Respuesta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mensaje;
	//private Topico topico;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	//private Usuario autor;
	private Boolean solucion = false;
	
	public Respuesta() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

//	public Topico getTopico() {
//		return topico;
//	}
//
//	public void setTopico(Topico topico) {
//		this.topico = topico;
//	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

//	public Usuario getAutor() {
//		return autor;
//	}
//
//	public void setAutor(Usuario autor) {
//		this.autor = autor;
//	}

	public Boolean getSolucion() {
		return solucion;
	}

	public void setSolucion(Boolean solucion) {
		this.solucion = solucion;
	}
	
	
	
	

}
