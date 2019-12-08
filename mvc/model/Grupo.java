package model;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class Grupo {

	String nome;
	private List<Observer> observers = new ArrayList<Observer>();
	public List<Contato> contatos = new ArrayList<>();


	public void attach(Observer ob) {
		observers.add(ob);
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
