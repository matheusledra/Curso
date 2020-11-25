package br.com.filmes.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmes.model.FilmeModel;

/**
 * Servlet implementation class FilmeController
 */
@WebServlet("/filme")
public class FilmeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmeModel modelo = new FilmeModel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = "" + request.getParameter("action");
		switch (action) {
		case "listFilmes":
			request.setAttribute("listFilmes", modelo.getListaFilmes());
			RequestDispatcher listFilmes = request.getRequestDispatcher("listFilmesAction.jsp");
			listFilmes.forward(request, response);
			break;
		case "novoFilme":
			request.setAttribute("listFilmes", modelo.getListaFilmes());
			RequestDispatcher novoFilme = request.getRequestDispatcher("novoFilmesAction.jsp");
			novoFilme.forward(request, response);
			break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "novoFilme":
			String titulo = request.getParameter("titulo");
			String classificacao = request.getParameter("classificacao");
			String genero = request.getParameter("genero");
			
			
			break;
		default:
			break;
		}
	}

}
