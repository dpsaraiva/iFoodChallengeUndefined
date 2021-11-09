package br.com.fiap.model;

import java.io.Serializable;

/**
 * Classe que abstrai o Insight
 * 
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */

public class Insight implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos:

	private String insight1;
	private String insight2;
	private String insight3;

	// Construtor vazio:

	public Insight() {
		super();
	}

	// Construtor que recebe todos parametros:

	public Insight(String insight1, String insight2, String insight3) {
		super();
		this.insight1 = insight1;
		this.insight2 = insight2;
		this.insight3 = insight3;
	}

	// Getters and setters:
	
	public String getInsight1() {
		return insight1;
	}

	public void setInsight1(String insight1) {
		this.insight1 = insight1;
	}

	public String getInsight2() {
		return insight2;
	}

	public void setInsight2(String insight2) {
		this.insight2 = insight2;
	}

	public String getInsight3() {
		return insight3;
	}

	public void setInsight3(String insight3) {
		this.insight3 = insight3;
	}
	
	// Metodo toString:
	
	@Override
	public String toString() {
		return "Insight [insight1=" + insight1 + ", insight2=" + insight2 + ", insight3=" + insight3 + "]";
	}
}