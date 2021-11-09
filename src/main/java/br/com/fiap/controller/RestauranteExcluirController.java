package br.com.fiap.controller;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.business.RestauranteBusiness;
import br.com.fiap.model.Restaurante;

@WebServlet("/restauranteExcluir")
public class RestauranteExcluirController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestauranteExcluirController() {
        super();
    }

    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	int codigo = Integer.parseInt(request.getParameter("id"));

        RestauranteBusiness restaurante = new RestauranteBusiness();
        restaurante.excluir(codigo);

		RestauranteBusiness restauranteBusiness = new RestauranteBusiness();
		List<Restaurante> listaRestaurantes = restauranteBusiness.listarTodos();

		request.setAttribute("listaRestaurantes", listaRestaurantes);

        RequestDispatcher rd = request.getRequestDispatcher("listaRestaurantes.jsp");
		
		rd.forward(request, response);
	}
    
}
