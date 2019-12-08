package model;

import java.util.ArrayList;
import java.util.List;

import persistencia.GrupoDAO;


public class Grupo implements GrupoDAO{

	String nome;
	private List<Contato> contatos = new ArrayList<>();
	private List<Grupo> banco = new ArrayList<>();
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

	public void listar() {
		System.out.println("**************************************");
		System.out.println("\nGrupo: "+this.getNome());
		for (Contato c: contatos) {
			c.listar();
		}
	}

	@Override
	public void salvar(Grupo g) {
		banco.add(g);
	}

	@Override
	public void addContato(Contato c) {
		contatos.add(c);
	}
	
	@Override
	public void addGrupo(Grupo g) {
		grupos.add(g);
	}
}
