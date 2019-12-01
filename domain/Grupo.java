package domain;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Component{

	String nome;
	private List<Component> componentes = new ArrayList<>();
	
	public Grupo(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Component> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Component> componentes) {
		this.componentes = componentes;
	}

	public void listar() {
		System.out.println("**************************************");
		System.out.println("\nGrupo: "+this.getNome());
		for (Component c: componentes) {
			c.listar();
		}
	}
	
	public void addElemento(Component c) {
		componentes.add(c);
	}
	
}
