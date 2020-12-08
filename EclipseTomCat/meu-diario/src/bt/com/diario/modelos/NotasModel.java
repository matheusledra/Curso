package bt.com.diario.modelos;

import java.util.List;

import br.com.diario.beans.Nota;
import bt.com.diario.dao.NotaDAO;

public class NotasModel {

	public static List<Nota> getListaNotas() {
		List<Nota> listaNotas = NotaDAO.getListaNotas();
		return listaNotas;
	}

	public static Nota getNotaById(int id) {
		return NotaDAO.getNotaByID(id);
	}

}
