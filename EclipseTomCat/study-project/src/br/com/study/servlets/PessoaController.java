package br.com.study.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.study.beans.Pessoa;
import br.com.study.dao.PessoaDAO;
import br.com.study.model.PessoaModel;

@WebServlet("/pessoa")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PessoaModel model = new PessoaModel();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = "" + request.getParameter("action");

		switch (action) {
		case "listPessoas":
			listarPessoas(request, response);
			break;
		case "cadPessoa":
			cadPessoa(request, response);
			break;
		case "verPessoa":
			verPessoa(request, response);
			break;
		case "editPessoa":
			editPessoa(request, response);
			break;
		case "delPessoa":
			delPessoa(request, response);
			break;
		default:
			break;
		}
	}
	
	private void delPessoa(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {
		request.setAttribute("pessoa", model.getPessoaByID(Long.parseLong(request.getParameter("id"))));
		RequestDispatcher rd = request.getRequestDispatcher("delPessoa.jsp");
        rd.forward(request, response);
	}

	protected void editPessoa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("pessoa", model.getPessoaByID(Long.parseLong(request.getParameter("id"))));
		RequestDispatcher rd = request.getRequestDispatcher("editPessoa.jsp");
        rd.forward(request, response);
	}
	
	protected void verPessoa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("pessoa", model.getPessoaByID(Long.parseLong(request.getParameter("id"))));
		RequestDispatcher rd = request.getRequestDispatcher("verPessoa.jsp");
        rd.forward(request, response);
	}

	protected void cadPessoa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadPessoa.jsp");
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String acao = request.getParameter("acao");
		String nome = request.getParameter("nome");
		String nascimento = request.getParameter("nascimento");
		String sexo = request.getParameter("sexo");
		Pessoa novaPessoa = new Pessoa(nome, nascimento, sexo);
		
		switch (acao) {
		case "novaPessoa":
			int linhasAfetadas = model.novaPessoa(novaPessoa);
			request.setCharacterEncoding("UTF-8");
			if(linhasAfetadas > 0) {
				request.setAttribute("redirectNewPerson", true);
				RequestDispatcher rd = request.getRequestDispatcher("listPessoasAction.jsp");
		        rd.forward(request, response);
			} else {
				boolean erro = true;
				
				request.setAttribute("pessoa", novaPessoa);
				request.setAttribute("erro", erro);
				RequestDispatcher rd = request.getRequestDispatcher("cadPessoa.jsp");
		        rd.forward(request, response);
			}
			break;
		case "editPessoa":
			novaPessoa.setId(Long.parseLong(request.getParameter("id")));
			
			int linhasAfetadasEdit = model.editPessoa(novaPessoa);
			
			if(linhasAfetadasEdit > 0) {
				request.setAttribute("redirectEditPerson", true);
				RequestDispatcher rd = request.getRequestDispatcher("listPessoasAction.jsp");
		        rd.forward(request, response);
			} else {
				boolean erro = true;
				
				request.setAttribute("pessoa", novaPessoa);
				request.setAttribute("erro", erro);
				RequestDispatcher rd = request.getRequestDispatcher("delPessoa.jsp");
		        rd.forward(request, response);
			}
			break;
		case "delPessoa":
			if(request.getParameter("senha").equals("secDel267pfdb")) {
				int linhasAfetadasDel = model.deletarPessoa(Long.parseLong(request.getParameter("id")));
				
				if(linhasAfetadasDel > 0) {
					request.setAttribute("redirectDelPerson", true);
					RequestDispatcher rd = request.getRequestDispatcher("listPessoasAction.jsp");
			        rd.forward(request, response);
				} else {
					boolean erro = true;
					
					request.setAttribute("erro", erro);
					RequestDispatcher rd = request.getRequestDispatcher("delPessoa.jsp");
			        rd.forward(request, response);
				}
			} else {
				boolean senhaIncorreta = true;
				
				request.setAttribute("pessoa", novaPessoa);
				request.setAttribute("senhaIncorreta", senhaIncorreta);
				RequestDispatcher rd = request.getRequestDispatcher("delPessoa.jsp");
		        rd.forward(request, response);
			}
			break;
		default:
			break;
		}
		
	}

	protected void listarPessoas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("listPessoas", PessoaDAO.listaPessoas());
		RequestDispatcher rd = request.getRequestDispatcher("listPessoasAction.jsp");
        rd.forward(request, response);
	}

}
