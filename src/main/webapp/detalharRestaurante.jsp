<%@page import="br.com.fiap.model.Restaurante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="detalheRestaurante" class="br.com.fiap.model.Restaurante" scope="request" />
<jsp:useBean id="listaInsights" class="java.util.ArrayList" scope="request"></jsp:useBean>

<!doctype html>
<html lang="pt-BR">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Insights</title>
  </head>
<body>

	<div class="container">
	
		<h2>Dados do Restaurante:</h2>
		<a href="listarRestaurantes" class="btn btn-light">Voltar</a>
		<p>Nome: ${detalheRestaurante.nomeRestaurante}</p>
		<p>CEP: ${detalheRestaurante.numeroCep}</p>
		<p>Número: ${detalheRestaurante.numeroLogradouro}</p>
		<p>Categoria: ${detalheRestaurante.categoriaRestaurante}</p>
		<p>Avaliação (0 - 10): ${detalheRestaurante.avaliacao}</p>
		<p>Quantidade de cozinheiros: ${detalheRestaurante.quantidadeCozinheiros}</p>
		<p>Quantidade de entregadores: ${detalheRestaurante.quantidadeEntregadores}</p>
		<p>Raio de atuação (km): ${detalheRestaurante.raioAtuacaoKm}</p>
		
		<c:forEach items="${listaInsights}" var="insight">
			<div class="card">
		  		<div class="card-body">
		   			${insight.insight1}
		  		</div>
			</div>
			
			<div class="card">
		  		<div class="card-body">
		   			${insight.insight2}
		  		</div>
			</div>
			
			<div class="card">
		  		<div class="card-body">
		   			${insight.insight3}
		  		</div>
			</div>
		</c:forEach>
		
	</div>
</body>
</html>