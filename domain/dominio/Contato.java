package model;

import java.util.List;
import java.util.ArrayList;

import persistencia.ContactDAO;

public class Contato {

	String nome;
	String numero;
	public List<Contato> banco = new ArrayList<>();
	
	public Contato(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
