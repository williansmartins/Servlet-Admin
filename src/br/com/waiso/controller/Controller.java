package br.com.waiso.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.waiso.dao.especific.CartaoDAOImpl;
import br.com.waiso.dao.especific.ICartaoDAO;
import br.com.waiso.entity.CartaoEntity;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
		System.out.println("Banco: " + request.getParameter("banco"));
		System.out.println("Agência: " + request.getParameter("agencia"));
		System.out.println("conta: " + request.getParameter("conta"));
		
		String banco = request.getParameter("banco");
		String agencia = request.getParameter("agencia");
		String conta = request.getParameter("conta");
		
		CartaoEntity cartao = new CartaoEntity();
		cartao.setBanco(banco);
		cartao.setAgencia(agencia);
		cartao.setConta(conta);
		
		ICartaoDAO dao = new CartaoDAOImpl();
		dao.insert(cartao);
		System.out.println("Sucesso!");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DELETE");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PUT");
	}
}
