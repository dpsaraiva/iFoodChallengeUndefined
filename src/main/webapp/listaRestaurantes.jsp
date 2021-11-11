<%@page import="br.com.fiap.model.Restaurante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<jsp:useBean id="listaRestaurantes" class="java.util.ArrayList" scope="request"></jsp:useBean>

<!doctype html>
<html lang="pt-BR">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Restaurantes</title>
  </head>
<body>

	<div class="container">
	
		<h1 class="mt-5 mb-4">Restaurantes</h1>
	
		<a href="cadastraRestaurante" class="btn btn-primary mb-3">Novo Restaurante</a>
		
		
		<table class="table table-hover align-middle">
			<thead>
				<tr>
					<th>Nome</th>
					<th>CEP</th>
					<th>Número</th>
					<th>Avaliação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaRestaurantes}" var="restaurante">
					<div class="d-flex justify-content-between">
						<tr>
							<td>${restaurante.nomeRestaurante}</td>
							<td>${restaurante.numeroCep}</td>
							<td>${restaurante.numeroLogradouro}</td>
							<td>${restaurante.avaliacao}</td>
							<td class="d-flex justify-content-end">
								<a href="detalhaRestaurante?id=${restaurante.codRestaurante}" class="btn btn-success me-2">Detalhes</a>
								<a href="editaRestaurante?id=${restaurante.codRestaurante}" class="btn btn-info me-2">Editar</a>
								<a href="restauranteExclui?id=${restaurante.codRestaurante}" class="btn btn-danger me-2">Excluir</a>
							</td>
						</tr>
					</div>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>