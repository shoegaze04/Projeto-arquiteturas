package mvc;

import java.util.ArrayList;
import java.util.List;

public class Grupoview implements Observer, Component {

	private Grupo model;
	private Grupocontroller cont = new Grupocontroller();
	List<Component> componentes = new ArrayList<>();

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
		mostrar();
	}

	public void mostrar() {

		System.out.println("*************************************");
		System.out.println("Grupo:" + model.getNome());

		for (Component c : componentes) {
			c.mostrar();
		}
	}

	public Grupocontroller getController() {
		return cont;
	}

	public List<Component> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Component> componentes) {
		this.componentes = componentes;
	}
}
