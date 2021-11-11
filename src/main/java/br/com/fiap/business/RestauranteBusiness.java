package br.com.fiap.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.RestauranteDAO;
import br.com.fiap.model.Restaurante;

public class RestauranteBusiness {

	public void cadastrar(Restaurante rb) {
		RestauranteDAO rdao = new RestauranteDAO();
		rdao.add(rb);
	}

	public List<Restaurante> listarTodos() {

		List<Restaurante> listaRestaurantes = new ArrayList<Restaurante>();

		RestauranteDAO rdao = new RestauranteDAO();
		listaRestaurantes = rdao.getAll();

		return listaRestaurantes;
	}

	public Restaurante pesquisarPorId(int codigo) {

		Restaurante restaurante = new Restaurante();
		RestauranteDAO rdao = new RestauranteDAO();
		restaurante = rdao.getById(codigo);

		return restaurante;
	}

	public void editar(Restaurante rb) {

		RestauranteDAO rdao = new RestauranteDAO();
		rdao.update(rb);
	}

	public void excluir(int codigo) {

		RestauranteDAO rdao = new RestauranteDAO();
		rdao.delete(codigo);

	}

}
