package mvc;

public class Contatoview implements Observer, Component {

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
		mostrar();
	}

	public void mostrar() {

		System.out.println("*************************************");
		System.out.println("\nNome:" + model.getNome());
		System.out.println("Numero:" + model.getNumero());
		System.out.println("Email:" + model.getEmail());
	}

	public Contatocontroller getController() {
		return cont;
	}

}
