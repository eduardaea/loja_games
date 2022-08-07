package com.generation.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.games.model.GamesModel;

public interface GamesRepository extends JpaRepository<GamesModel,Long> {

}
