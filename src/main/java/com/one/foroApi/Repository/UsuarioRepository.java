package com.one.foroApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.foroApi.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
