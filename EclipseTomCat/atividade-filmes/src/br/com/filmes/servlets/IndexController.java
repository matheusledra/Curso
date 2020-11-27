package br.com.filmes.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmes.model.FilmeModel;

@WebServlet("/inicio")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FilmeModel modelo = new FilmeModel();

		request.setAttribute("qntdTopFilmes", modelo.getTopFilmes().size());
		request.setAttribute("listOK", true);
		request.setAttribute("topFilmes", modelo.getTopFilmes());
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
