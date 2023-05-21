package com.one.foroApi.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	@OneToOne
	private Topico topico;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	@OneToOne
	private Usuario autor;
	private Boolean solucion = false;
	
	public Respuesta() {
	}
	


	public Respuesta(Long id, String mensaje, Topico topico, LocalDateTime fechaCreacion, Usuario autor,
			Boolean solucion) {
		this.id = id;
		this.mensaje = mensaje;
		this.topico = topico;
		this.fechaCreacion = fechaCreacion;
		this.autor = autor;
		this.solucion = solucion;
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

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public Boolean getSolucion() {
		return solucion;
	}

	public void setSolucion(Boolean solucion) {
		this.solucion = solucion;
	}
	
	
	
	

}
