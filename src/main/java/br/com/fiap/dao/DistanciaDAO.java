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
	
	@Override
	public Distancia getMaxDistancia(int codigo) {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT COUNT(CD_DISTANCIA),\r\n"
					+ "NR_INICIO_FAIXA_DISTANCIA, \r\n"
					+ "NR_TERMINO_FAIXA_DISTANCIA\r\n"
					+ "FROM T_DISTANCIA\r\n"
					+ "INNER JOIN T_ENTREGA\r\n"
					+ "ON T_DISTANCIA.CD_DISTANCIA = T_ENTREGA.T_DISTANCIA_CD_DISTANCIA\r\n"
					+ "INNER JOIN T_TP_PEDIDO\r\n"
					+ "ON T_ENTREGA.T_TP_PEDIDO_CD_TP_PEDIDO = T_TP_PEDIDO.CD_TP_PEDIDO\r\n"
					+ "INNER JOIN T_RESTAURANTE\r\n"
					+ "ON T_ENTREGA.T_RESTAURANTE_CD_RESTAURANTE = T_RESTAURANTE.CD_RESTAURANTE\r\n"
					+ "WHERE CD_RESTAURANTE = ?\r\n"
					+ "GROUP BY CD_DISTANCIA, NR_INICIO_FAIXA_DISTANCIA, NR_TERMINO_FAIXA_DISTANCIA\r\n"
					+ "ORDER BY COUNT(CD_DISTANCIA) DESC\r\n"
					+ "FETCH FIRST 1 ROWS ONLY");
			stmt.setInt(1, codigo);
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Distancia d = new Distancia();
				d.setInicioFaixaDistancia(result.getDouble("NR_INICIO_FAIXA_DISTANCIA"));
				d.setTerminoFaixaDistancia(result.getDouble("NR_TERMINO_FAIXA_DISTANCIA"));
				return d;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Distancia getMinDistancia(int codigo) {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT COUNT(CD_DISTANCIA),\r\n"
					+ "NR_INICIO_FAIXA_DISTANCIA, \r\n"
					+ "NR_TERMINO_FAIXA_DISTANCIA\r\n"
					+ "FROM T_DISTANCIA\r\n"
					+ "INNER JOIN T_ENTREGA\r\n"
					+ "ON T_DISTANCIA.CD_DISTANCIA = T_ENTREGA.T_DISTANCIA_CD_DISTANCIA\r\n"
					+ "INNER JOIN T_TP_PEDIDO\r\n"
					+ "ON T_ENTREGA.T_TP_PEDIDO_CD_TP_PEDIDO = T_TP_PEDIDO.CD_TP_PEDIDO\r\n"
					+ "INNER JOIN T_RESTAURANTE\r\n"
					+ "ON T_ENTREGA.T_RESTAURANTE_CD_RESTAURANTE = T_RESTAURANTE.CD_RESTAURANTE\r\n"
					+ "WHERE CD_RESTAURANTE = ?\r\n"
					+ "GROUP BY CD_DISTANCIA, NR_INICIO_FAIXA_DISTANCIA, NR_TERMINO_FAIXA_DISTANCIA\r\n"
					+ "ORDER BY COUNT(CD_DISTANCIA) ASC\r\n"
					+ "FETCH FIRST 1 ROWS ONLY");
			stmt.setInt(1, codigo);
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Distancia d = new Distancia();
				d.setInicioFaixaDistancia(result.getDouble("NR_INICIO_FAIXA_DISTANCIA"));
				d.setTerminoFaixaDistancia(result.getDouble("NR_TERMINO_FAIXA_DISTANCIA"));
				return d;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}