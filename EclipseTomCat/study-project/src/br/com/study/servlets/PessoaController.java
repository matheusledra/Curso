package br.com.study.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.study.dao.PessoaDAO;

@WebServlet("/pessoa")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = "" + request.getParameter("action");

		switch (action) {
		case "listPessoas":
			listarPessoas(request, response);
			break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void listarPessoas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("listPessoas", PessoaDAO.listaPessoas());
		RequestDispatcher rd = request.getRequestDispatcher("listPessoasAction.jsp");
        rd.forward(request, response);
	}

}
