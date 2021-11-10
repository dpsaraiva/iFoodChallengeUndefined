package br.com.fiap.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Distancia;
import br.com.fiap.model.Restaurante;

public class DistanciaDAO implements IDataHandler<Distancia> {

	@Override
	public List<?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Distancia getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Distancia obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Distancia obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Distancia getMaxDistancia() {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("QUERY AQUI");
			stmt.setInt(1, id);
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Distancia r = new Distancia();
				r.setCodRestaurante(result.getInt("CD_RESTAURANTE"));
				r.setNomeRestaurante(result.getString("NM_RESTAURANTE"));
				return r;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}