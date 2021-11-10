package br.com.fiap.business;

import br.com.fiap.dao.DistanciaDAO;
import br.com.fiap.model.Distancia;

public class DistanciaBusiness {

	public Distancia pesquisarMelhorDistancia() {
			
		Distancia distancia = new Distancia();
		DistanciaDAO ddao = new DistanciaDAO();
		distancia = ddao.getMaxDistancia();
		
		return distancia;
	}
}
