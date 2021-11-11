package br.com.fiap.model;

import java.io.Serializable;

public class Distancia implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos:

	private int codDistancia;
	private double inicioFaixaDistancia;
	private double terminoFaixaDistancia;

	// Construtor vazio:

	public Distancia() {
		super();
	}

	// Construtor que recebe todos parametros:

	public Distancia(int codDistancia, double inicioFaixaDistancia, double terminoFaixaDistancia) {
		super();
		this.codDistancia = codDistancia;
		this.inicioFaixaDistancia = inicioFaixaDistancia;
		this.terminoFaixaDistancia = terminoFaixaDistancia;
	}

	// Getters and setters:

	public int getCodDistancia() {
		return codDistancia;
	}

	public void setCodDistancia(int codDistancia) {
		this.codDistancia = codDistancia;
	}

	public double getInicioFaixaDistancia() {
		return inicioFaixaDistancia;
	}

	public void setInicioFaixaDistancia(double inicioFaixaDistancia) {
		this.inicioFaixaDistancia = inicioFaixaDistancia;
	}

	public double getTerminoFaixaDistancia() {
		return terminoFaixaDistancia;
	}

	public void setTerminoFaixaDistancia(double terminoFaixaDistancia) {
		this.terminoFaixaDistancia = terminoFaixaDistancia;
	}

	// Metodo toString:

	@Override
	public String toString() {
		return "Distancia [codDistancia=" + codDistancia + ", inicioFaixaDistancia=" + inicioFaixaDistancia
				+ ", terminoFaixaDistancia=" + terminoFaixaDistancia + "]";
	}
}