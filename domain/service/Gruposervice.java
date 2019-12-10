package service;

import model.Contato;
import model.Grupo;
import persistencia.GrupoDAO;

public class Gruposervice implements GrupoDAO{

	
	@Override
	public void listar(Grupo grupo) {
		
		System.out.println("------------------------------------------");
		System.out.println("\nGrupo: "+grupo.getNome());
		for (Contato c: grupo.contatos) {
			System.out.println("------------------------------------------");
			System.out.println("Nome: "+c.getNome());
			System.out.println("Numero: "+c.getNumero());
		}
	}

	@Override
	public void salvar(Grupo g) {
		g.banco.add(g);
	}

	@Override
	public void addContato(Grupo g, Contato c) {
		g.contatos.add(c);
	}
	
	@Override
	public void addGrupo(Grupo g, Grupo g2) {
		g.grupos.add(g2);
	}

	
}
