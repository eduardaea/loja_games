package com.generation.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.games.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel,Long> {

}
