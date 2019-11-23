package mvc;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Contato model = new Contato();
		Contatoview view = new Contatoview();
		
		Grupo model2 = new Grupo();
		Grupoview view2 = new Grupoview();
		
		view.initialize(model);
		Contatocontroller cont = view.getController();
		
		view2.initialize(model2);
		Grupocontroller cont2 = view2.getController();

		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.println("Entre com o nome do contato: ");
			String nome = scan.next();
			System.out.println("Entre com o contato: ");
			String numero = scan.next();
			
			System.out.println("Entre com o nome do grupo: ");
			String grupo = scan.next();
			
			cont2.handleEvent(grupo);			
			cont.handleEvent(nome, numero);
			System.out.println();
		}
		
	}

}
