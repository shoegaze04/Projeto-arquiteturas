package controller;


import model.Contato;
import model.Grupo;
import observer.Observer;
import view.Grupoview;


public class Grupocontroller implements Observer{

	private Grupoview view1;
	private Grupo model;

	@Override
	public void update() {
		
	}
	
	public void inicializa(Grupo model, Grupoview view) {
		model.attach(this);
		this.view1 = view;
		this.model = model;
	}
	
	public void handleEvents(String nome){
		getModel().setNome(nome);
	}
	
	public void addContato(Contato c) {
		this.getModel().contatos.add(c);
	}
	
	public void addGrupo(Grupo g) {
		this.getModel().grupos.add(g);
	}

	public Grupo getModel() {
		return model;
	}

	public void setModel(Grupo model) {
		this.model = model;
	}

}
