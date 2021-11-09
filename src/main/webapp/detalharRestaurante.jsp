<%@page import="br.com.fiap.model.Restaurante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="detalheRestaurante" class="br.com.fiap.model.Restaurante" scope="request" />

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
		<h1 class="mt-5 mb-4">Detalhes de Restaurante</h1>
		<a href="listarRestaurantes" class="btn btn-light">Voltar</a>
		<form action="detalharRestaurante" method="get">
			<div class="d-flex flex-column bd-highlight mb-3 col-sm-7">
				<label for="id-nome-restaurante" class="mt-3">Nome do Restaurante:</label>
				<input class ="form-control form-control-sm mt-2"type="text" value="${detalheRestaurante.nomeRestaurante}" name="nome-restaurante" id="id-nome-restaurante" width="400px">
			</div>
				<div class="col-sm-3">
					<label class="mb-2" for="id-cep">CEP:</label>
					<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.numeroCep}" name="cep" id="id-cep">
				</div>
			<div>
				<div class="col-sm-3" >
					<label class="mb-2" for="id-numero-logradouro">Número:</label>
					<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.numeroLogradouro}" name="numero-logradouro" id="id-numero-logradouro">
				</div>	
			</div>
			<div class="col-sm-3">
				<label class="mb-2 form-label" for="id-categoria">Categoria:</label>
				<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.categoriaRestaurante}" name="categoria" id="id-categoria">
			</div>
			<div class="col-sm-2">
				<label class="mb-2" for="id-avaliacao">Avaliação (0 - 10):</label>
				<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.avaliacao}" name="avaliacao" id="id-avaliacao">
			</div>
			<div class="col-sm-2">
				<label class="mb-2" for="id-quantidade-cozinheiros">Quantidade de cozinheiros:</label>
				<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.quantidadeCozinheiros}" name="quantidade-cozinheiros" id="id-quantidade-cozinheiros">
			</div>
			<div class="col-sm-2">
				<label class="mb-2" for="id-quantidade-entregadores">Quantidade de entregadores:</label>
				<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.quantidadeEntregadores}" name="quantidade-entregadores" id="id-quantidade-entregadores">
			</div>
			<div class="col-sm-2">
				<label class="mb-2" for="id-raio-atuacao-km">Raio de atuação (km):</label>
				<input class="form-control form-control-sm mb-3" type="text" value="${detalheRestaurante.raioAtuacaoKm}" name="raio-atuacao-km" id="id-raio-atuacao-km">
			</div>
		</form>
	</div>
</body>
</html>