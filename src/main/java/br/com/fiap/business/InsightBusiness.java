package br.com.fiap.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Insight;

public class InsightBusiness {
	
	public List<Insight> listarTodos() {
		
		List<Insight> lista = new ArrayList<Insight>();
		
		Insight insight = new Insight();
		insight.setInsight1("Insight 1");
		insight.setInsight2("Insight 2");
		insight.setInsight3("Insight 3");

		lista.add(insight);

		return lista;
	}
}
