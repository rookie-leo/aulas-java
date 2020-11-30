package br.com.sys.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sys.model.Personagem;
import br.com.sys.model.PersonagemDao;

/**
 * Servlet implementation class Entrada
 */
@WebServlet("/entrada")
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;//Endereço de memória onde se encontram os obj da classe
       
    public Entrada() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");
		PersonagemDao personagemDao = new PersonagemDao();
		
		if(acao.equals("mostrar")) {
			
			ArrayList<Personagem> personagens = personagemDao.mostrarTodos();
			
			request.setAttribute("personagens", personagens);
			RequestDispatcher rd = request.getRequestDispatcher("/mostrarpersonagens.jsp");//referencia o endereço da tela
			rd.forward(request, response);
		}else if (acao.equals("incluir")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("/cadastrarpersonagem.jsp");//referencia o endereço da tela
			rd.forward(request, response);
		}else if (acao.equals("excluir")) {
			
			int cod = Integer.parseInt(request.getParameter("codigo"));
			
			personagemDao.excluirPorCodigo(cod);
			response.sendRedirect("http://localhost:8080/CadastroWaifuSys/entrada?acao=mostrar");//Retorna para a tela principal
		}else if (acao.equals("alterar")) {
			
			int cod = Integer.parseInt(request.getParameter("codigo"));
			
			Personagem personagem = personagemDao.mostrarPorCodigo(cod);
			request.setAttribute("personagem", personagem);
			RequestDispatcher rd = request.getRequestDispatcher("/alterarpersonagem.jsp");//referencia o endereço da tela
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("txtacao");
		
		String nome = request.getParameter("txtnome");
		String classe = request.getParameter("txtclasse");
		int vida = Integer.parseInt(request.getParameter("txtvida"));
		int forca = Integer.parseInt(request.getParameter("txtforca"));
		int defesa = Integer.parseInt(request.getParameter("txtdefesa"));
		
		PersonagemDao personagemDao = new PersonagemDao();
		Personagem personagem = new Personagem(nome, classe, vida, forca, defesa);
		
		if (acao.equals("incluir")) {
			personagemDao.cadastratar(personagem);
			response.sendRedirect("http://localhost:8080/CadastroWaifuSys/entrada?acao=mostrar");//Retorna para a tela principal
		}else if (acao.equals("alterar")) {
			personagem.setCodigo(Integer.parseInt(request.getParameter("txtcodigo")));
			personagemDao.alterarPorCod(personagem);
			response.sendRedirect("http://localhost:8080/CadastroWaifuSys/entrada?acao=mostrar");//Retorna para a tela principal
		}
	}

}
