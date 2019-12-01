package domain;

public class Contato implements Component{

	String nome;
	String numero;
	String email;
	
	public Contato(String nome, String numero, String email) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void listar() {
		System.out.println("**************************************");
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Email: "+this.getEmail());
	}
	
}
