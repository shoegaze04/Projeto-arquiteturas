package mvc;

public class Grupoview implements Observer{

	private Grupo model;
	private Grupocontroller cont = new Grupocontroller();
	
	public void initialize(Grupo model) {

		this.model = model;
		model.attach(this);
		makeController();
		cont.initialize(model, this);
	}

	private void makeController() {

		Grupocontroller cont = new Grupocontroller();
		this.cont = cont;
	}
	
	@Override
	public void update() {
		display();
	}

	public void display() {

		System.out.println("\nGrupo: "+model.getNome());
		for () {
			
		}
	}

	public Grupocontroller getController() {
		return cont;
	}

}
