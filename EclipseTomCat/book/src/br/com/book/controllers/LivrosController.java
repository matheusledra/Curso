package br.com.book.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import br.com.book.beans.Livros;
import br.com.book.model.LivrosModel;

@WebServlet("/social")
public class LivrosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LivrosModel modelo = new LivrosModel();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("usuarioLogado") != null) {
			boolean usuarioLogado = (session.getAttribute("usuarioLogado").equals("1")) ? true : false;
		
			if(usuarioLogado) {
				String action = (request.getParameter("action") != null) ? request.getParameter("action") : "";
				
				switch (action) {
				case "getListaAjax":
					getListaAjax(request, response);
					break;
				default:
					RequestDispatcher rd = request.getRequestDispatcher("listLivros.jsp");
					rd.forward(request, response);
					break;
				}
			}
		} else {
			response.sendRedirect("login?action=login");
		}
	}
	
	protected void getListaAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = (request.getParameter("titulo") != null) ? request.getParameter("titulo") : "";
		List<Livros> listaLivros = modelo.getListaLivrosTitulo(titulo);
		Gson gson = new Gson();
		String retorno = gson.toJson(listaLivros);
		System.out.println(retorno);
		response.getWriter().print(retorno);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
