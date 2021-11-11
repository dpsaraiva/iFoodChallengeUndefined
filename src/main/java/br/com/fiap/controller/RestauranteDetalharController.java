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
import br.com.fiap.model.Distancia;
import br.com.fiap.model.Restaurante;
import br.com.fiap.model.TipoPedido;

@WebServlet("/detalhaRestaurante")
public class RestauranteDetalharController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RestauranteDetalharController() {
        super();
    }

   // int codRestaurante;
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	int codigo = Integer.parseInt(request.getParameter("id"));

        Restaurante restaurante = new RestauranteBusiness().pesquisarPorId(codigo);
        System.out.println("Retorno do metodo doGet RestaurantedetalharController " + restaurante);
       
        //codRestaurante = restaurante.getCodRestaurante();

        request.setAttribute("detalheRestaurante", restaurante);
        
        /*
        Distancia distanciaMaisPedidos = new DistanciaBusiness().pesquisarDistanciaMaxima(codigo);
        System.out.println("DIST Controller: " + distanciaMaisPedidos);
        Distancia distanciaMenosPedidos = new DistanciaBusiness().pesquisarDistanciaMinima(codigo);
        
        
        
        TipoPedido tipoPedidoMaisEntregas = new TipoPedido();
        TipoPedido tipoPedidoMenosEntregas = new TipoPedido();        
        
  		
  		//Web
  		request.setAttribute("distanciaMaisPedidos", distanciaMaisPedidos);
  		request.setAttribute("distanciaMenosPedidos", distanciaMenosPedidos);
  		request.setAttribute("tipoPedidoMaisEntregas", tipoPedidoMaisEntregas);
  		request.setAttribute("tipoPedidoMenosEntregas", tipoPedidoMenosEntregas);
  		
  		*/

        RequestDispatcher rd = request.getRequestDispatcher("detalharRestaurante.jsp");
		
		rd.forward(request, response);
	}
    
  /*  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
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
            restaurante.setRaioAtuacaoKm(Integer.parseInt(request.getParameter("raio-atuacao-km")));

            RestauranteBusiness rb = new RestauranteBusiness();
            rb.editar(restaurante);
            
          //Java
          	List<Restaurante> listaRestaurantes = rb.listarTodos();
          		
          	System.out.println("Retorno do metodo doPost RestauranteEditarController " + listaRestaurantes);
          		
          	//Web
          	request.setAttribute("listaRestaurantes", listaRestaurantes);
            RequestDispatcher rd = request.getRequestDispatcher("listaRestaurantes.jsp");

            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }*/
}
