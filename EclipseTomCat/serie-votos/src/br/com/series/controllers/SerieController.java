package br.com.series.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.series.beans.Serie;
import br.com.series.model.SerieModel;

@WebServlet("/serie")
public class SerieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SerieModel modelo = new SerieModel();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = "" + request.getParameter("action");
		
		switch (action) {
		case "listSeries":
			listSeries(request, response);
			break;
		case "verSerie":
			verSerie(request, response);
			break;
		case "cadSerie":
			cadSerie(request, response);
			break;
		case "editSerie":
			editSerie(request, response);
			break;
		case "addVoto":
			addVoto(request, response);
			break;
		case "delSerie":
			delSerieAction(request, response);
			break;
		default:
			actionNaoReconhecida(action, request, response);
			break;
		}
	}
	
	protected void actionNaoReconhecida(String action, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("action", action);
		
		RequestDispatcher rd = request.getRequestDispatcher("actionNaoReconhecida.jsp");
		rd.forward(request, response);
	}
	
	protected void listSeries(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listSeries", modelo.getListSeries());
		
		String ae = "" + request.getParameter("ae");
		String redirectMessage = "";
		if(!ae.equals("")) {
			if(ae.equals("novaSerie")) {
				redirectMessage = "Nova série Adicionada!";
			} else if(ae.equals("delSerie")) {
				redirectMessage = "Serie Deletada!";
			}
		}
		
		request.setAttribute("redirectMessage", redirectMessage);
		RequestDispatcher rd = request.getRequestDispatcher("listSeriesAction.jsp");
		rd.forward(request, response);
	}
	
	protected void verSerie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idSerie = Integer.parseInt(request.getParameter("id"));
		Serie serie = modelo.getSerieByID(idSerie);
		request.setAttribute("serie", serie);
		request.setAttribute("topCinco", modelo.getTopCinco());
		
		String ae = "" + request.getParameter("ae");
		String redirectMessage = "";
		if(!ae.equals("")) {
			if(ae.equals("editSerie")) {
				redirectMessage = "Série Editada!";
			}
		}
		
		request.setAttribute("redirectMessage", redirectMessage);
		RequestDispatcher rd = request.getRequestDispatcher("verSerieAction.jsp");
		rd.forward(request, response);
	}
	
	protected void cadSerie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadSerieAction.jsp");
		rd.forward(request, response);
	}
	
	protected void editSerie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idSerie = Integer.parseInt(request.getParameter("id"));
		Serie serie = modelo.getSerieByID(idSerie);
		request.setAttribute("serie", serie);
		request.setAttribute("topCinco", modelo.getTopCinco());
		
		RequestDispatcher rd = request.getRequestDispatcher("editSerieAction.jsp");
		rd.forward(request, response);
	}
	
	protected void addVoto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if(modelo.addVoto(id) > 0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("ERRO");
		}
	}
	
	protected void delSerieAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idSerie = Integer.parseInt(request.getParameter("id"));
		
		if(modelo.delSerie(idSerie) > 0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("ERRO");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = "" + request.getParameter("acao");
		
		switch (acao) {
			case "editSerie":
				editSerieAction(request, response);
				break;
			case "cadSerie":
				cadSerieAction(request, response);
				break;
			default:
				break;
		}
	}
	
	protected void editSerieAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Serie serie = new Serie(Integer.parseInt(request.getParameter("id")), request.getParameter("nome"));
		
		if(modelo.editSerie(serie) > 0) {
			int idSerie = Integer.parseInt(request.getParameter("id"));
			Serie serieEnviar = modelo.getSerieByID(idSerie);
			request.setAttribute("serie", serieEnviar);
			request.setAttribute("topCinco", modelo.getTopCinco());
			request.setAttribute("redirectByEditSerie", true);
			
			RequestDispatcher rd = request.getRequestDispatcher("verSerieAction.jsp");
			rd.forward(request, response);
		}
	}
	
	protected void cadSerieAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Serie serie = new Serie();
		serie.setNome(request.getParameter("nome"));
		
		if(modelo.cadSerie(serie) > 0) {
			request.setAttribute("redirectByNovaSerie", true);
			
			RequestDispatcher rd = request.getRequestDispatcher("listSeriesAction.jsp");
			rd.forward(request, response);
		}
	}

}
