package br.com.lovefood.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lovefood.service.FuncionarioService;

	public class ServletCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "/sistema/func/";

	public ServletCliente() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getServletPath().equals(PREFIX + "buscar")) {
			buscar(request, response);

		} else if (request.getServletPath().equals(PREFIX + "excluir")) {
			response.getWriter().append("excluir");

		} else {
			response.getWriter().append("URL N�o encontrada!");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void buscar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		if (request.getParameter("nome") != null) {
			response.getWriter().append("buscar pelo nome: " + request.getParameter("nome"));
		
		} else if (request.getParameter("id") != null) {
			response.getWriter().append("buscar pelo id: " + request.getParameter("id"));
		
		} else {
			response.getWriter().append("buscar todos");
		}
	}
	
	private void excluir(HttpServletRequest request, HttpServletResponse resquere)
			throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		
		String resposta = "";
		
		if(new FuncionarioService().excluir(id)) {
			resposta = "Cliente excluido com sucesso";
		}
		
		ServletResponse response = null;
		response.getWriter().append(resposta);
	}
}


