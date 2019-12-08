package app;

import java.util.Scanner;

import controller.Contatocontroller;
import controller.Grupocontroller;
import model.Contato;
import model.Grupo;
import view.Contatoview;
import view.Grupoview;

public class App {

	public static void main(String[] args) {

		Grupo modelg = new Grupo();
		Grupoview viewg = new Grupoview();

		viewg.inicializa(modelg);
		Grupocontroller contg = viewg.getCont();
		String nome = "Agenda";
		contg.handleEvents(nome);

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

			switch (op) {

			case (1):

				viewg.display();
				for (Grupo mod : contg.grupos) {
					System.out.println("-----------------------------------------------");
					System.out.println("Nome do grupo: " + mod.getNome());
					System.out.println(mod.getContatos());
				}

				break;

			case (2):

				Grupo modelg2 = new Grupo();
				Grupoview viewg2 = new Grupoview();

				viewg2.inicializa(modelg2);
				Grupocontroller contg2 = viewg2.getCont();

				System.out.println("Entre com o nome do grupo:");
				String name = scan.next();

				contg2.handleEvents(name);

				contg.addGrupo(modelg2);

				break;

			case (3):

				Contato model2 = new Contato();
				Contatoview view2 = new Contatoview();

				view2.initialize(model2);
				Contatocontroller cont2 = view2.getCont();

				System.out.println("Entre com o nome do contato:");
				String nome2 = scan.next();
				System.out.println("Entre com o numero:");
				String numero2 = scan.next();

				cont2.handleEvent(nome2, numero2);

				System.out.println("Digite o nome do grupo á adicionar: ");
				String grupo = scan.next();

				for (Grupo gr : contg.grupos) {
					if (gr.getNome().equals(grupo)) {
						gr.attach(view2);
					}
				}

				break;

			case (4):

				System.out.println("Digite o nome do grupo a ser exibido: ");
				String grupo2 = scan.next();

				for (Grupo gr2 : contg.grupos) {
					if (gr2.getNome().equals(grupo2)) {
						System.out.println(gr2.getNome());
						System.out.println(gr2.getContatos());
					}
				}

				break;

			default:
				System.out.println("\n~Opção invalida!\n");
			}
		}

	}

}
