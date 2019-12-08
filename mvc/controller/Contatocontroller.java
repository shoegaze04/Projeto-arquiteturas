package controller;

import model.Contato;
import observer.Observer;
import view.Contatoview;

public class Contatocontroller implements Observer{

	private Contatoview view1;
	private Contato model;
	
	@Override
	public void update() {
		
	}

	public void inicializa(Contato model, Contatoview view) {
		model.attach(this);
		this.view1 = view;
		this.model = model;
	}
	
	public void handleEvent(String nome, String numero) {
		model.setNome(nome);
		model.setNumero(numero);
	}
	
}
