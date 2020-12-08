package br.com.book.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.book.beans.Usuario;
import br.com.book.model.UsuariosModel;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuariosModel modeloUsers = new UsuariosModel();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = "" + request.getParameter("action");
		
		switch (action) {
		case "login":
			login(request, response);
			break;
		case "register":
			register(request, response);
			break;
		case "logout":
			logoutAction(request, response);
			break;
		default:
			break;
		}
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	
	private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = "" + request.getParameter("action");
		
		switch (action) {
		case "login":
			loginAction(request, response);
			break;
		case "register":
			registerAction(request, response);
			break;
		default:
			logoutAction(request, response);
			break;
		}
		
	}
	
	private void registerAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user, senha, confirmSenha, nome;
		
		nome = request.getParameter("nome");
		user = request.getParameter("usuario"); 
		senha = request.getParameter("senha");
		confirmSenha = request.getParameter("confirmSenha");
		
		if(!user.trim().isEmpty() && !senha.trim().isEmpty() && !confirmSenha.trim().isEmpty()) {
			if(!modeloUsers.verificaUsuarioExistente(user)) {
				if(senha.equals(confirmSenha)) {
					Usuario newUser = new Usuario(nome, user, senha);
					
					if(modeloUsers.novoUsuario(newUser) > 0) {
						request.setAttribute("registrado", true);
						RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
						rd.forward(request, response);
					}
				} else {
					request.setAttribute("senhasNaoConcidem", true);
					RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
					rd.forward(request, response);
				}
			} else {
				request.setAttribute("usuarioExistente", true);
				RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
				rd.forward(request, response);
			}
		} else {
			request.setAttribute("campoBranco", true);
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
	}
	
	private void logoutAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("usuarioLogado", null);
		session.setAttribute("primeiroNome", null);
		session.setAttribute("nomeCompleto", null);
		session.setAttribute("login", null);
		response.sendRedirect("http://localhost:8080/book/");
	}
	
	private void loginAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		HttpSession session = request.getSession();
		
		Usuario usuario = modeloUsers.getUser(login, senha);
		System.out.println(usuario);
		if(usuario != null) {
			String primeiroNome = usuario.getNome().split(" ")[0];
			session.setAttribute("usuarioLogado", "1");
			session.setAttribute("primeiroNome", primeiroNome);
			session.setAttribute("nomeCompleto", usuario.getNome());
			session.setAttribute("login", usuario.getLogin());
			response.sendRedirect("social");
		} else {
			request.setAttribute("error", true);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
