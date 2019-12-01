package mvc;

import java.util.ArrayList;
import java.util.List;

public class Grupo{

	String nome;
	private List<Observer> observers = new ArrayList<Observer>();

	
	public void attach(Observer ob) {
		observers.add(ob);
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
