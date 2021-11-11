package br.com.fiap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.business.RestauranteBusiness;
import br.com.fiap.model.Restaurante;

@WebServlet("/cadastrarRestaurante")
public class RestauranteCadastrarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RestauranteCadastrarController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("cadastrarRestaurante.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Restaurante restaurante = new Restaurante();
		restaurante.setNomeRestaurante(request.getParameter("nome-restaurante"));
		restaurante.setNumeroCep(request.getParameter("cep"));
		restaurante.setNumeroLogradouro(request.getParameter("numero-logradouro"));
		restaurante.setCategoriaRestaurante(request.getParameter("categoria"));
		restaurante.setAvaliacao(Integer.parseInt(request.getParameter("avaliacao")));
		restaurante.setQuantidadeCozinheiros(Integer.parseInt(request.getParameter("quantidade-cozinheiros")));
		restaurante.setQuantidadeEntregadores(Integer.parseInt(request.getParameter("quantidade-entregadores")));
		restaurante.setRaioAtuacaoKm(Double.valueOf(request.getParameter("raio-atuacao-km")));

		RestauranteBusiness rb = new RestauranteBusiness();
		rb.cadastrar(restaurante);

		RestauranteBusiness restauranteBusiness = new RestauranteBusiness();
		List<Restaurante> listaRestaurantes = restauranteBusiness.listarTodos();

		System.out.println("LISTA: " + listaRestaurantes);

		request.setAttribute("listaRestaurantes", listaRestaurantes);
		RequestDispatcher rd = request.getRequestDispatcher("listaRestaurantes.jsp");
		rd.forward(request, response);
	}
}
