package view;

import model.Contato;
import controller.Contatocontroller;
import observer.Observer;

public class Contatoview implements Observer{

	private Contato model;
	private Contatocontroller cont;

	@Override
	public void update() {

	}
	
	public void display() {
		System.out.println("---------------------------------------------\n");
		System.out.println("Nome: "+model.getNome());
		System.out.println("Numero: "+model.getNumero());
	}
	
	public void initialize(Contato model) {

		this.model = model;
		model.attach(this);
		makeController();
		cont.inicializa(model, this);
	}

	private void makeController() {

		Contatocontroller cont = new Contatocontroller();
		this.cont = cont;
	}

	public Contatocontroller getCont() {
		return cont;
	}

}
