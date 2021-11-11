package br.com.fiap.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Entrega implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos:

	private int codEntrega;
	private Timestamp dataHoraEntrega;

	// Construtor vazio:

	public Entrega() {
		super();
	}

	// Construtor que recebe todos parametros:

	public Entrega(int codEntrega, Timestamp dataHoraEntrega) {
		super();
		this.codEntrega = codEntrega;
		this.dataHoraEntrega = dataHoraEntrega;
	}

	// Getters and setters:

	public int getCodEntrega() {
		return codEntrega;
	}

	public void setCodEntrega(int codEntrega) {
		this.codEntrega = codEntrega;
	}

	public Timestamp getDataHoraEntrega() {
		return dataHoraEntrega;
	}

	public void setDataHoraEntrega(Timestamp dataHoraEntrega) {
		this.dataHoraEntrega = dataHoraEntrega;
	}

	// Metodo toString:

	@Override
	public String toString() {
		return "Entrega [codEntrega=" + codEntrega + ", dataHoraEntrega=" + dataHoraEntrega + "]";
	}

}