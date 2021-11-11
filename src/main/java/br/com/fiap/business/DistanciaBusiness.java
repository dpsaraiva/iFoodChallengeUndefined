package br.com.fiap.business;

import br.com.fiap.dao.DistanciaDAO;
import br.com.fiap.model.Distancia;

public class DistanciaBusiness {

	public Distancia pesquisarDistanciaMaxima(int codigo) {
			
		Distancia distancia = new Distancia();
		DistanciaDAO ddao = new DistanciaDAO();
		distancia = ddao.getMaxDistancia(codigo);
		
		System.out.println("DIST Business: " + distancia);
		
		return distancia;
	}
	
	public Distancia pesquisarDistanciaMinima(int codigo) {
		
		Distancia distancia = new Distancia();
		DistanciaDAO ddao = new DistanciaDAO();
		distancia = ddao.getMinDistancia(codigo);
		
		return distancia;
	}
}
