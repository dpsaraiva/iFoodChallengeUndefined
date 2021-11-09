package br.com.fiap.model;

import java.io.Serializable;

/**
 * Classe que abstrai o TipoPedido
 * 
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */

public class TipoPedido implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos:

	private int codTipoPedido;
	private String descricaoTipoPedido;

	// Construtor vazio:

	public TipoPedido() {
		super();
	}

	// Construtor que recebe todos parametros:

	public TipoPedido(int codTipoPedido, String descricaoTipoPedido) {
		super();
		this.codTipoPedido = codTipoPedido;
		this.descricaoTipoPedido = descricaoTipoPedido;
	}

	// Getters and setters:

	public int getCodTipoPedido() {
		return codTipoPedido;
	}

	public void setCodTipoPedido(int codTipoPedido) {
		this.codTipoPedido = codTipoPedido;
	}

	public String getDescricaoTipoPedido() {
		return descricaoTipoPedido;
	}

	public void setDescricaoTipoPedido(String descricaoTipoPedido) {
		this.descricaoTipoPedido = descricaoTipoPedido;
	}

	// Metodos CRUD:
	
	

	// Metodo toString:
	
	@Override
	public String toString() {
		return "TipoPedido [codTipoPedido=" + codTipoPedido + ", descricaoTipoPedido=" + descricaoTipoPedido + "]";
	}

}