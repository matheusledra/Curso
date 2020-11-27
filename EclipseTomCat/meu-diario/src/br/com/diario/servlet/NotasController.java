package br.com.diario.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.diario.beans.Nota;
import bt.com.diario.modelos.NotasModel;

@WebServlet("/notas")
public class NotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = "" + request.getParameter("action");
		
		switch (action) {
		case "listNotas":
			listAction(request, response);
			break;
		case "cadNota":
			cadAction(request, response);
			break;
		case "editNota":
			
			break;
		default:
			break;
		}
	}
	
	private void cadAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadNota.jsp");
		rd.forward(request, response);
	}
	
	private void listAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Nota> listaNotas = NotasModel.getListaNotas(); 
		
		request.setAttribute("listaNotas", listaNotas);
		RequestDispatcher rd = request.getRequestDispatcher("listNotas.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
