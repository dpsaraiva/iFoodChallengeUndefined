package br.com.fiap.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Distancia;
import br.com.fiap.model.TipoPedido;

public class TipoPedidoDAO{


	public TipoPedido getPedidoMaisEntregue() {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT COUNT(T_ENTREGA.T_TP_PEDIDO_CD_TP_PEDIDO) , T_TP_PEDIDO.DS_TP_PEDIDO FROM T_ENTREGA INNER JOIN T_TP_PEDIDO ON T_ENTREGA.T_TP_PEDIDO_CD_TP_PEDIDO = T_TP_PEDIDO.CD_TP_PEDIDO GROUP BY T_TP_PEDIDO_CD_TP_PEDIDO, T_TP_PEDIDO.DS_TP_PEDIDO ORDER BY T_TP_PEDIDO_CD_TP_PEDIDO ASC FETCH FIRST 1 ROWS ONLY");
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				TipoPedido tp = new TipoPedido();
				tp.setDescricaoTipoPedido(result.getString("DS_TP_PEDIDO"));
				return tp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public TipoPedido getPedidoMenosEntregue() {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT COUNT(T_ENTREGA.T_TP_PEDIDO_CD_TP_PEDIDO) , T_TP_PEDIDO.DS_TP_PEDIDO FROM T_ENTREGA INNER JOIN T_TP_PEDIDO ON T_ENTREGA.T_TP_PEDIDO_CD_TP_PEDIDO = T_TP_PEDIDO.CD_TP_PEDIDO GROUP BY T_TP_PEDIDO_CD_TP_PEDIDO, T_TP_PEDIDO.DS_TP_PEDIDO ORDER BY T_TP_PEDIDO_CD_TP_PEDIDO DESC FETCH FIRST 1 ROWS ONLY");
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				TipoPedido tp = new TipoPedido();
				tp.setDescricaoTipoPedido(result.getString("DS_TP_PEDIDO"));
				return tp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}