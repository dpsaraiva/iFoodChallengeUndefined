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

@WebServlet("/editarRestaurante")
public class RestauranteEditarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RestauranteEditarController() {
		super();
	}

	int codRestaurante;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int codigo = Integer.parseInt(request.getParameter("id"));

		Restaurante restaurante = new RestauranteBusiness().pesquisarPorId(codigo);
		System.out.println("Retorno do metodo doGet RestauranteEditarController " + restaurante.getCodRestaurante());

		codRestaurante = restaurante.getCodRestaurante();

		request.setAttribute("restaurante", restaurante);

		RequestDispatcher rd = request.getRequestDispatcher("editarRestaurante.jsp");

		rd.forward(request, response);
		System.out.println("Retorno do metodo doGet2 RestauranteEditarController " + codRestaurante);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Restaurante restaurante = new Restaurante();
			restaurante.setCodRestaurante(codRestaurante);
			restaurante.setNomeRestaurante(request.getParameter("nome-restaurante"));
			restaurante.setNumeroCep(request.getParameter("cep"));
			restaurante.setNumeroLogradouro(request.getParameter("numero-logradouro"));
			restaurante.setCategoriaRestaurante(request.getParameter("categoria"));
			restaurante.setAvaliacao(Integer.parseInt(request.getParameter("avaliacao")));
			restaurante.setQuantidadeCozinheiros(Integer.parseInt(request.getParameter("quantidade-cozinheiros")));
			restaurante.setQuantidadeEntregadores(Integer.parseInt(request.getParameter("quantidade-entregadores")));
			restaurante.setRaioAtuacaoKm(Double.valueOf(request.getParameter("raio-atuacao-km")));

			RestauranteBusiness rb = new RestauranteBusiness();
			rb.editar(restaurante);

			List<Restaurante> listaRestaurantes = rb.listarTodos();

			request.setAttribute("listaRestaurantes", listaRestaurantes);
			RequestDispatcher rd = request.getRequestDispatcher("listaRestaurantes.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
