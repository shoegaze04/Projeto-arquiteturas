package service;

import model.Contato;
import persistencia.ContactDAO;

public class Contatoservice implements ContactDAO{
	
	@Override
	public void listar(Contato c) {
		System.out.println("------------------------------------------");
		System.out.println("\nNome: "+c.getNome());
		System.out.println("Numero: "+c.getNumero());
	}

	@Override
	public void salvar(Contato contato) {
		contato.banco.add(contato);
	}

}
