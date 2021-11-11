package br.com.fiap.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Restaurante;

public class RestauranteDAO implements IDataHandler<Restaurante> {

	@Override
	public List<Restaurante> getAll() {

		DAO dao = new DAO();
		List<Restaurante> listP = new ArrayList<Restaurante>();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_RESTAURANTE");
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Restaurante r = new Restaurante();
				r.setCodRestaurante(result.getInt("CD_RESTAURANTE"));
				r.setNomeRestaurante(result.getString("NM_RESTAURANTE"));
				r.setNumeroCep(result.getString("NR_CEP"));
				r.setNumeroLogradouro(result.getString("NR_LOGRADOURO"));
				r.setCategoriaRestaurante(result.getString("DS_CATEGORIA_RESTAURANTE"));
				r.setAvaliacao(result.getInt("NR_AVALIACAO"));
				r.setQuantidadeCozinheiros(result.getInt("NR_COZINHEIROS"));
				r.setQuantidadeEntregadores(result.getInt("NR_ENTREGADORES"));
				r.setRaioAtuacaoKm(result.getDouble("NR_RAIO_ATUACAO_KM"));
				listP.add(r);
			}
			return listP;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Restaurante getById(int id) {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_RESTAURANTE WHERE CD_RESTAURANTE = ?");
			stmt.setInt(1, id);
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Restaurante r = new Restaurante();
				r.setCodRestaurante(result.getInt("CD_RESTAURANTE"));
				r.setNomeRestaurante(result.getString("NM_RESTAURANTE"));
				r.setNumeroCep(result.getString("NR_CEP"));
				r.setNumeroLogradouro(result.getString("NR_LOGRADOURO"));
				r.setCategoriaRestaurante(result.getString("DS_CATEGORIA_RESTAURANTE"));
				r.setAvaliacao(result.getInt("NR_AVALIACAO"));
				r.setQuantidadeCozinheiros(result.getInt("NR_COZINHEIROS"));
				r.setQuantidadeEntregadores(result.getInt("NR_ENTREGADORES"));
				r.setRaioAtuacaoKm(result.getDouble("NR_RAIO_ATUACAO_KM"));
				return r;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int add(Restaurante obj) {

		DAO dao = new DAO();

		try {
			PreparedStatement stmt = dao.getConnection().prepareStatement(
					"INSERT INTO T_RESTAURANTE(CD_RESTAURANTE, NM_RESTAURANTE, NR_CEP, NR_LOGRADOURO, DS_CATEGORIA_RESTAURANTE, NR_AVALIACAO, "
							+ "NR_COZINHEIROS, NR_ENTREGADORES, NR_RAIO_ATUACAO_KM) VALUES (CD_RESTAURANTE.NEXTVAL,?,?,?,?,?,?,?,?)");
			//stmt.setInt(1, 1);
			stmt.setString(1, obj.getNomeRestaurante());
			stmt.setString(2, obj.getNumeroCep());
			stmt.setString(3, obj.getNumeroLogradouro());
			stmt.setString(4, obj.getCategoriaRestaurante());
			stmt.setInt(5, obj.getAvaliacao());
			stmt.setInt(6, obj.getQuantidadeCozinheiros());
			stmt.setInt(7, obj.getQuantidadeEntregadores());
			stmt.setDouble(8, obj.getRaioAtuacaoKm());
			return dao.executeCommand(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int delete(int id) {

		DAO dao = new DAO();

		try {
			PreparedStatement stmt = dao.getConnection()
					.prepareStatement("DELETE FROM T_RESTAURANTE WHERE CD_RESTAURANTE = ?");
			stmt.setInt(1, id);
			return dao.executeCommand(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int update(Restaurante obj) {

		DAO dao = new DAO();

		try {
			PreparedStatement stmt = dao.getConnection()
					.prepareStatement("UPDATE T_RESTAURANTE SET NM_RESTAURANTE = ?, NR_CEP = ?, NR_LOGRADOURO = ?, DS_CATEGORIA_RESTAURANTE = ?, NR_AVALIACAO = ?,"
							+ "NR_COZINHEIROS = ?, NR_ENTREGADORES = ?, NR_RAIO_ATUACAO_KM = ? WHERE CD_RESTAURANTE = ?");
			stmt.setString(1, obj.getNomeRestaurante());
			stmt.setString(2, obj.getNumeroCep());
			stmt.setString(3, obj.getNumeroLogradouro());
			stmt.setString(4, obj.getCategoriaRestaurante());
			stmt.setInt(5, obj.getAvaliacao());
			stmt.setInt(6, obj.getQuantidadeCozinheiros());
			stmt.setInt(7, obj.getQuantidadeEntregadores());
			stmt.setDouble(8, obj.getRaioAtuacaoKm());
			stmt.setInt(9, obj.getCodRestaurante());
			
			return dao.executeCommand(stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}

}