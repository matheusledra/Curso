package br.com.projetoweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.dao.PessoaDAO;

@WebServlet(urlPatterns = "/list-pessoas")
public class HelloWorldServLet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		
		PessoaDAO pessDao = new PessoaDAO();
		ArrayList<Pessoa> listaPessoas = pessDao.listaPessoas();
		
		out.println("<html>");
		for (int i = 0; i < listaPessoas.size(); i++) {
			out.println("<hr>");
			out.println("<h4>ID: [" + listaPessoas.get(i).getId() + "]</h4>");
			out.println("<h4>Nome: " + listaPessoas.get(i).getNome() + "</h4>");
			out.println("<h4>Nasc: " + listaPessoas.get(i).getDtNascimento() + "</h4>");
			out.println("<h4>Sexo: " + listaPessoas.get(i).getSexo() + "</h4>");
		}
		out.println("</html>");
	}
	
}
