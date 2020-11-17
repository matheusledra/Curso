package br.com.projetoweb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.dao.PessoaDAO;
import br.com.projetoweb.model.PessoaModel;

/**
 * Servlet implementation class PessoaController
 */
@WebServlet("/pessoa")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PessoaModel modelo = new PessoaModel();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAction = "" + request.getParameter("action");
		
		switch (paramAction) {
		case "listPessoas":
			listaPessoasAction(request, response);
			break;
		case "cadPessoas":
			cadPessoasAction(request, response);
			break;
		case "cadNovaPessoa":
			cadNovaPessoa(request, response);
			break;
		default:
			pageNotFound(request, response);
			break;
		} 
	}
	
	protected void pageNotFound(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("pageNotFound.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void listaPessoasAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Pessoa> listaPessoas = modelo.listaPessoas();
		
		request.setAttribute("listaPessoas", listaPessoas);
		RequestDispatcher rd = request.getRequestDispatcher("listaPessoasAction.jsp");
        rd.forward(request, response);
	}
	
	protected void cadPessoasAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadPessoasAction.jsp");
        rd.forward(request, response);
	}
	
	protected void cadNovaPessoa(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		long id = PessoaDAO.listaPessoas().get((PessoaDAO.listaPessoas().size() - 1)).getId() + 1;
		
		PessoaDAO.adicionarPessoa(id, req.getParameter("nome"), "UNDF");
	}

}
