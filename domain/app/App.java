package app;

import java.util.Scanner;

import model.Contato;
import model.Grupo;
import service.Contatoservice;
import service.Gruposervice;

public class App {

	public static void main(String[] args) {

		Contato c1 = new Contato("Drake", "123");
		Contato c2 = new Contato("Carla", "456");
		Contato c3 = new Contato("Renata", "789");


		Grupo g1 = new Grupo("P7");
		Gruposervice s1 = new Gruposervice();
		
		Grupo g4 = new Grupo("Agenda");
		Gruposervice s4 = new Gruposervice();
		
		s1.addContato(g1,c1);
		s1.addContato(g1,c2);
		s1.addContato(g1,c3);


		s4.addGrupo(g4,g1);

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("|====================================|");
			System.out.println("|                MENU                |");
			System.out.println("|====================================|");
			System.out.println("| 1- Mostrar Agenda                  |");
			System.out.println("| 2- Criar Grupo                     |");
			System.out.println("| 3- Adicionar em Grupo              |");
			System.out.println("| 4- Mostrar Grupo                   |");
			System.out.println("|====================================|");
			System.out.print("Opção:");

			int op = scan.nextInt();
			System.out.println();

			switch (op) {

			case (1):

				System.out.println("Grupo: " + g4.getNome());
				for (Grupo gr3 : g4.grupos) {
					Gruposervice s3 = new Gruposervice();
					s3.listar(gr3);
				}

				break;

			case (2):

				System.out.print("Nome do grupo: ");
				String name = scan.next();

				Grupo g2 = new Grupo(name);
				s4.addGrupo(g4,g2);				

				break;

			case (3):

				System.out.print("Nome: ");
				String nome2 = scan.next();
				System.out.print("Numero: ");
				String numero2 = scan.next();

				Contato c5 = new Contato(nome2, numero2);

				System.out.println("Digite o nome do grupo á adicionar: ");
				String grupo = scan.next();

				for (Grupo gr : g4.grupos) {
					if (gr.getNome().equals(grupo)) {
						
						Gruposervice s3 = new Gruposervice();
						s3.addContato(gr,c5);
					} 
				}

				break;

			case (4):

				System.out.println("Digite o nome do grupo a ser exibido: ");
				String grupo2 = scan.next();

				for (Grupo gr2 : g4.grupos) {
					if (gr2.getNome().equals(grupo2)) {
						
						Gruposervice s3 = new Gruposervice();
						s3.listar(gr2);
					}
				}

				break;

			default:
				System.out.println("\n~Opção invalida!\n");

			}
		}

	}
}
