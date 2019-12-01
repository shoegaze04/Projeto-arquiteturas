package mvc;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Contato model = new Contato();
		Contatoview view = new Contatoview();

		Grupo modelg = new Grupo();
		Grupoview view2 = new Grupoview();

		view.initialize(model);
		Contatocontroller cont = view.getController();
		
		view2.initialize(modelg);
		Grupocontroller cont2 = view2.getController();

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Entre com o nome do contato: ");
			String nome = scan.next();
			System.out.println("Entre com o contato: ");
			String numero = scan.next();
			System.out.println("Entre com o email: ");
			String email = scan.next();
			
			System.out.println("Entre com o nome do grupo: ");
			String grupo = scan.next();
			
			cont2.handleEvent(grupo);			
			cont.handleEvent(nome, numero, email);
			cont2.addElement(view);
			System.out.println();
		}
	}
	
}
