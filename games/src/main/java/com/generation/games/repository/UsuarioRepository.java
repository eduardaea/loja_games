package com.generation.games.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.games.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel,Long>{

	public Optional <UsuarioModel> findbyUsuario(String usuario);
}
