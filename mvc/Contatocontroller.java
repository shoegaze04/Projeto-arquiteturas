package mvc;

public class Contatocontroller implements Observer{

	private Contatoview view1;
	private Contato model;

	@Override
	public void update() {
		
	}

	public void initialize(Contato model, Contatoview view) {
		model.attach(this);
		this.view1 = view;
		this.model = model;

	}
	
	public void handleEvent(String nome, String numero, String email) {
		model.setNome(nome);
		model.setNumero(numero);
		model.setEmail(email);
	}

}
