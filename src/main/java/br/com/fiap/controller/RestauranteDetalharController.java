package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.business.DistanciaBusiness;
import br.com.fiap.business.RestauranteBusiness;
import br.com.fiap.business.TipoPedidoBusiness;
import br.com.fiap.model.Distancia;
import br.com.fiap.model.Restaurante;
import br.com.fiap.model.TipoPedido;

@WebServlet("/detalharRestaurante")
public class RestauranteDetalharController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RestauranteDetalharController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int codigo = Integer.parseInt(request.getParameter("id"));

		Restaurante restaurante = new RestauranteBusiness().pesquisarPorId(codigo);
		System.out.println("Retorno do metodo doGet RestaurantedetalharController " + restaurante);

		request.setAttribute("detalheRestaurante", restaurante);

		Distancia distanciaMaisPedidos = new DistanciaBusiness().pesquisarDistanciaMaxima(codigo);
		Distancia distanciaMenosPedidos = new DistanciaBusiness().pesquisarDistanciaMinima(codigo);

		TipoPedido tipoPedidoMaisEntregas = new TipoPedidoBusiness().pesquisarPedidoMaisEntregue();
		TipoPedido tipoPedidoMenosEntregas = new TipoPedidoBusiness().pesquisarPedidoMenosEntregue();

		request.setAttribute("distanciaMaisPedidos", distanciaMaisPedidos);
		request.setAttribute("distanciaMenosPedidos", distanciaMenosPedidos);
		request.setAttribute("tipoPedidoMaisEntregas", tipoPedidoMaisEntregas);
		request.setAttribute("tipoPedidoMenosEntregas", tipoPedidoMenosEntregas);

		RequestDispatcher rd = request.getRequestDispatcher("detalharRestaurante.jsp");

		rd.forward(request, response);
	}

}
