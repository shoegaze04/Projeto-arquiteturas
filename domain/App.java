package domain;

public class App {

	public static void main(String[] args) {

		Contato c1 = new Contato("Drake","123","semnome@gmail.com");
		Contato c2 = new Contato("Carla","456","semnome2@gmail.com");
		Contato c3 = new Contato("Renata","789","semnome3@gmail.com");
		
		Grupo g1 = new Grupo("P7");
		
		g1.addElemento(c1);
		g1.addElemento(c2);
		g1.addElemento(c3);
		
		System.out.println();
		
		Grupo g2 = new Grupo("IF");
		
		g2.addElemento(g1);
		
		g2.listar();
	}

}
