package app;

import java.util.Scanner;

import model.Contato;
import model.Grupo;

public class App {

	public static void main(String[] args) {

		Contato c1 = new Contato("Drake", "123");
		Contato c2 = new Contato("Carla", "456");
		Contato c3 = new Contato("Renata", "789");

		Grupo g1 = new Grupo("P7");
		Grupo g4 = new Grupo("Agenda");

		g1.addContato(c1);
		g1.addContato(c2);
		g1.addContato(c3);

		g4.addGrupo(g1);

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

				System.out.println("Nome: " + g4.getNome());
				for (Grupo gr3 : g4.grupos) {
					gr3.listar();
				}

				break;

			case (2):

				System.out.print("Nome: ");
				String name = scan.next();

				Grupo g2 = new Grupo(name);
				g4.addGrupo(g2);				

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
						gr.addContato(c5);
					} 
				}

				break;

			case (4):

				System.out.println("Digite o nome do grupo a ser exibido: ");
				String grupo2 = scan.next();

				for (Grupo gr2 : g4.grupos) {
					if (gr2.getNome().equals(grupo2)) {
						gr2.listar();
					}
				}

				break;

			default:
				System.out.println("\n~Opção invalida!\n");

			}
		}

	}
}
