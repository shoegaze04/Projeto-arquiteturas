package view;


import controller.Grupocontroller;
import model.Contato;
import model.Grupo;
import observer.Observer;


public class Grupoview implements Observer {

	private Grupo model;
	private Grupocontroller cont = new Grupocontroller();


	@Override
	public void update() {

	}

	public void display() {
		System.out.println("---------------------------------------------\n");
		System.out.println("Nome do grupo: " + model.getNome());
		
		for(Contato c: cont.getModel().contatos) {
			System.out.println("---------------------------------------------\n");
			System.out.println("Nome: "+c.getNome());
			System.out.println("Numero: "+c.getNumero());
		}
	}

	public void inicializa(Grupo model) {

		this.model = model;
		model.attach(this);
		makeController();
		cont.inicializa(model, this);
	}

	private void makeController() {

		Grupocontroller cont = new Grupocontroller();
		this.cont = cont;
	}

	public Grupocontroller getCont() {
		return cont;
	}

	public Grupo getModel() {
		return model;
	}

	public void setModel(Grupo model) {
		this.model = model;
	}
	
}
