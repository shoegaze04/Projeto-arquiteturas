package persistencia;

import model.Contato;
import model.Grupo;

public interface GrupoDAO {

	void salvar(Grupo g);

	void listar();

	void addContato(Contato c);
	
	void addGrupo(Grupo g);
	
}
