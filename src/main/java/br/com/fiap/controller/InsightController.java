package br.com.fiap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.business.InsightBusiness;
import br.com.fiap.model.Insight;

@WebServlet("/listarInsights")
public class InsightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsightController() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	//Java
		InsightBusiness InsightBusiness = new InsightBusiness();
		List<Insight> listaInsights = InsightBusiness.listarTodos();
		
		
		//Web
		request.setAttribute("listaInsights", listaInsights);
		RequestDispatcher rd = request.getRequestDispatcher("insights.jsp");  
		rd.forward(request, response);
	}
}
