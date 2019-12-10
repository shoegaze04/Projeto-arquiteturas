package model;

import java.util.ArrayList;
import java.util.List;


public class Grupo {

	String nome;
	public List<Contato> contatos = new ArrayList<>();
	public List<Grupo> banco = new ArrayList<>();
	public List<Grupo> grupos = new ArrayList<>();

	public Grupo(String nome) {
		super();
		this.nome = nome;
	}
	

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
