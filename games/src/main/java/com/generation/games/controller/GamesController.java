package com.generation.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.games.model.GamesModel;
import com.generation.games.repository.GamesRepository;


@RestController
@RequestMapping("/games")
@CrossOrigin("*")
public class GamesController {
	
	@Autowired
	private GamesRepository gamesRepository;
	
	@GetMapping
	public ResponseEntity<List<GamesModel>>get(){
		return ResponseEntity.ok(gamesRepository.findAll());
	}
	@PostMapping
	public ResponseEntity<GamesModel>post(@RequestBody GamesModel games){
		return ResponseEntity.ok(gamesRepository.save(games));
	}
	@PutMapping
	public ResponseEntity<GamesModel>get(@RequestBody GamesModel games){
		return ResponseEntity.ok(gamesRepository.save(games));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		gamesRepository.deleteById(id);
	}

}
