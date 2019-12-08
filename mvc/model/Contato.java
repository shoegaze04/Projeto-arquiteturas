package model;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class Contato {

	String nome;
	String numero;
	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer ob) {
		observers.add(ob);
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
		notifyObservers();
	}
	
	private void notifyObservers() {
		for (Observer ob : observers) {
			ob.update();
		}
	}
}
