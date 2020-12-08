package br.com.book.model;

import java.util.List;

import br.com.book.beans.Relacionamento;
import br.com.book.dao.RelacionamentoDAO;

public class RelacionamentoModel {

	public List<Relacionamento> getListRels() {
		return RelacionamentoDAO.getListRels();
	}
}
