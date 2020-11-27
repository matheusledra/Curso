package br.com.series.model;

import java.util.List;

import br.com.series.beans.Serie;
import br.com.series.dao.SeriesDAO;

public class SeriesModel {

	public static List<Serie> getListSeries() {
		return SeriesDAO.getListSeries();
	}
	
	

}
