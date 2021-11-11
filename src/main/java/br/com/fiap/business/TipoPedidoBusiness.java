package br.com.fiap.business;

import br.com.fiap.dao.TipoPedidoDAO;
import br.com.fiap.model.TipoPedido;

public class TipoPedidoBusiness {

	public TipoPedido pesquisarPedidoMaisEntregue() {

		TipoPedido tipoPedido = new TipoPedido();
		TipoPedidoDAO tpdao = new TipoPedidoDAO();
		tipoPedido = tpdao.getPedidoMaisEntregue();

		return tipoPedido;
	}

	public TipoPedido pesquisarPedidoMenosEntregue() {

		TipoPedido tipoPedido = new TipoPedido();
		TipoPedidoDAO tpdao = new TipoPedidoDAO();
		tipoPedido = tpdao.getPedidoMenosEntregue();

		return tipoPedido;
	}

}
