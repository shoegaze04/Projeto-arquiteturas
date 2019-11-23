package mvc;

public class Contatoview implements Observer{

	private Contato model;
	private Contatocontroller cont = new Contatocontroller();
	
	public void initialize(Contato model) {

		this.model = model;
		model.attach(this);
		makeController();
		cont.initialize(model, this);
	}

	private void makeController() {

		Contatocontroller cont = new Contatocontroller();
		this.cont = cont;
	}
	
	@Override
	public void update() {
		display();
	}

	public void display() {

		System.out.println("\nNome: "+model.getNome());
		System.out.println("\nContato: "+model.getNumero());
	}

	public Contatocontroller getController() {
		return cont;
	}

}
