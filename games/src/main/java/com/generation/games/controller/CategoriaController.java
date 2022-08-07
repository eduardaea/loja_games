package com.generation.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.generation.games.model.CategoriaModel;
import com.generation.games.repository.CategoriaRepository;


public class CategoriaController {
	@Autowired 
	private CategoriaRepository categorias;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>>getAll(){
		return ResponseEntity.ok(categorias.findAll());
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel>post(@RequestBody CategoriaModel categoria){
		return ResponseEntity.ok(categorias.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<CategoriaModel>put(@RequestBody CategoriaModel categoria){
		return ResponseEntity.accepted().build();
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		categorias.deleteById(id);
	}
}
