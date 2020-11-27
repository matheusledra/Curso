package br.com.filmes.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmes.beans.Filme;
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
			listFilmes(request, response);
			break;
		case "novoFilme":
			novoFilme(request, response);
			break;
		case "verFilme":
			verFilme(request, response);
			break;
		case "editFilme":
			editFilme(request, response);
			break;
		case "delFilme":
			delFilme(request, response);
			break;
		default:
			break;
		}
	}
	
	private void delFilme(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		if(modelo.delFilme(id) > 0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("ERRO");
		}
	}
	
	private void editFilme(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("filme", modelo.getFilme(id));
		RequestDispatcher listFilmes = request.getRequestDispatcher("editFilmeAction.jsp");
		listFilmes.forward(request, response);
	}
	
	private void verFilme(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("qntdTopFilmes", modelo.getTopFilmes().size());
		request.setAttribute("filme", modelo.getFilme(id));
		request.setAttribute("topFilmes", modelo.getTopFilmes());
		RequestDispatcher listFilmes = request.getRequestDispatcher("verFilmeAction.jsp");
		listFilmes.forward(request, response);
	}
	
	private void listFilmes(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		request.setAttribute("listFilmes", modelo.getListaFilmes());
		RequestDispatcher listFilmes = request.getRequestDispatcher("listFilmesAction.jsp");
		listFilmes.forward(request, response);
	}
	
	private void novoFilme(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		RequestDispatcher novoFilme = request.getRequestDispatcher("novoFilmesAction.jsp");
		novoFilme.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "novoFilme":
			addNovoFilme(request, response);
			break;
		case "editFilme":
			editFilmeAction(request, response);
			break;
		default:
			break;
		}
	}
	
	private void addNovoFilme(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String classificacao = request.getParameter("classificacao");
		String genero = request.getParameter("genero");
		String descricao = request.getParameter("descricao");
		boolean topFilme = ("" + request.getParameter("topfilme")).equalsIgnoreCase("true") ? true : false;
		Filme filme = new Filme(titulo, descricao, classificacao, genero, topFilme);
		
		int linhasAfetadas = modelo.addFilme(filme);
		
		if(linhasAfetadas > 0) {
			request.setAttribute("redirect", true);
			request.setAttribute("listFilmes", modelo.getListaFilmes());
			RequestDispatcher listFilmes = request.getRequestDispatcher("listFilmesAction.jsp");
			listFilmes.forward(request, response);
		}
	}
	
	private void editFilmeAction(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String titulo = request.getParameter("titulo");
		String classificacao = request.getParameter("classificacao");
		String genero = request.getParameter("genero");
		String descricao = request.getParameter("descricao");
		boolean topFilme = ("" + request.getParameter("topfilme")).equalsIgnoreCase("true") ? true : false;
		Filme filme = new Filme(id, titulo, descricao, classificacao, genero, topFilme);
		
		int linhasAfetadas = modelo.editFilme(filme);
		
		if(linhasAfetadas > 0) {
			request.setAttribute("redirect", true);
			request.setAttribute("filme", modelo.getFilme(id));
			request.setAttribute("topFilmes", modelo.getTopFilmes());
			RequestDispatcher listFilmes = request.getRequestDispatcher("verFilmeAction.jsp");
			listFilmes.forward(request, response);
		}
	}

}
