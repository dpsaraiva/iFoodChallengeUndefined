<%@page import="br.com.fiap.model.Restaurante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
	
		<h2>Dados:</h2>
		<p>Nome do Restaurante:</p>
		<p>CEP:</p>
		<p>Número:</p>
		<p>Hora de início do funcionamento:</p>
		<p>Hora de término do funcionamento:</p>
		<p>Categoria:</p>
		<p>Avaliação (0 - 10):</p>
		<p>Quantidade de cozinheiros:</p>
		<p>Quantidade de entregadores:</p>
		<p>Raio de atuação (km):</p>
		
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
		
		<a href="exibirRestaurante" class="btn btn-info">Voltar</a>
		
	</div>
</body>
</html>