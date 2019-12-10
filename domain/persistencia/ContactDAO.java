package persistencia;

import model.Contato;

public interface ContactDAO {

	void salvar(Contato c);

	void listar(Contato c);
}
