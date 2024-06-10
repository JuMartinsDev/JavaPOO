package br.com.fiap.petshop.model;

import java.time.LocalDate;

public class Pessoa {

	public String nome;
	public LocalDate nascimento;
	
	public Pessoa(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		//faz a conta pra devolver a idade da pessoa
		return LocalDate.now().getYear() - nascimento.getYear();
	}

	public void setNome(String nome) {
		//atribuiru nome (parâmetro) para nome (atributo)
		//se refere ao nome da classe pessoa
		this.nome = nome;
	}
	
	public void setIdade() {
		
	}
}
