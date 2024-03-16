package com.github.GabrielPl1.thymeleaf.model;

public class Pessoa {
	private Long id;
	public Pessoa(Long id, String nome, char sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	public String nome;
	public char sexo;
	
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
}
