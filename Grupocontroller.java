package mvc;

public class Grupocontroller implements Observer{

	private Grupoview view2;
	private Grupo model;

	@Override
	public void update() {
		
	}

	public void initialize(Grupo model, Grupoview view) {
		model.attach(this);
		this.view2 = view;
		this.model = model;

	}
	
	public void handleEvent(String nome) {
		model.setNome(nome);
	}
	
	public void addGrupo(Contato c) {
		model.setContato(c);
	}

}
