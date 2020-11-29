package br.com.series.model;

import java.util.List;

import br.com.series.beans.Serie;
import br.com.series.dao.SerieDAO;

public final class SerieModel {
	
	public List<Serie> getTopCinco() {
		return SerieDAO.getTopCinco();
	}
	
	public List<Serie> getListSeries() {
		return SerieDAO.listSeries();
	}

	public Serie getSerieByID(int id) {
		return SerieDAO.getSerieByID(id);
	}
	
	public int delSerie(int id) {
		return SerieDAO.delSerie(id);
	}
	
	public int editSerie(Serie serie) {
		return SerieDAO.editSerie(serie);
	}
	
	public int addVoto(int id) {
		return SerieDAO.addVoto(id);
	}
	
	public int cadSerie(Serie serie) {
		return SerieDAO.cadSerie(serie);
	}
}
