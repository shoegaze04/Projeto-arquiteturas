package controller;

import java.util.ArrayList;
import java.util.List;

import model.Contato;
import model.Grupo;
import observer.Observer;
import view.Grupoview;

public class Grupocontroller implements Observer{

	private Grupoview view1;
	private Grupo model;
	public List<Contato> contatos = new ArrayList<>();
	public List<Grupo> grupos = new ArrayList<>();

	@Override
	public void update() {
		
	}
	
	public void inicializa(Grupo model, Grupoview view) {
		model.attach(this);
		this.view1 = view;
		this.model = model;
	}
	
	public void handleEvents(String nome){
		model.setNome(nome);
	}
	
	public void addContato(Contato c) {
		contatos.add(c);
	}
	
	public void addGrupo(Grupo g) {
		grupos.add(g);
	}

}
