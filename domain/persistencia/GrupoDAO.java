package persistencia;

import model.Contato;
import model.Grupo;

public interface GrupoDAO {

	void salvar(Grupo g);

	void listar(Grupo g);

	void addContato(Grupo g, Contato c);
	
	void addGrupo(Grupo g, Grupo g2);
	
}
