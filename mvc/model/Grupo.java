package model;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class Grupo {

	String nome;
	private List<Observer> observers = new ArrayList<Observer>();
	public List<Contato> contatos = new ArrayList<>();
	public List<Grupo> grupos = new ArrayList<>();


	public void attach(Observer ob) {
		observers.add(ob);
	}
	
	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		notifyObservers(); 
	}
	
	private void notifyObservers() {
		for (Observer ob : observers) {
			ob.update();
		}
	}
	
}
