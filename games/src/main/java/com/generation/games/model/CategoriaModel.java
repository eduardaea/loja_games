package com.generation.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private Long id;
	
	@NotBlank
	private String nome;
	
	@OneToMany(mappedBy = "categoria", cascade =  CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<GamesModel>game;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<GamesModel> getGame() {
		return game;
	}

	public void setGame(List<GamesModel> game) {
		this.game = game;
	}


}
