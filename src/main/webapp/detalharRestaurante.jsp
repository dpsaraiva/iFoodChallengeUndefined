<%@page import="br.com.fiap.model.Restaurante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="detalheRestaurante" class="br.com.fiap.model.Restaurante" scope="request" />

<jsp:useBean id="distanciaMaisPedidos" class="br.com.fiap.model.Distancia" scope="request"></jsp:useBean>
<jsp:useBean id="distanciaMenosPedidos" class="br.com.fiap.model.Distancia" scope="request"></jsp:useBean>
<jsp:useBean id="tipoPedidoMaisEntregas" class="br.com.fiap.model.TipoPedido" scope="request"></jsp:useBean>
<jsp:useBean id="tipoPedidoMenosEntregas" class="br.com.fiap.model.TipoPedido" scope="request"></jsp:useBean>

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
	
		<h1>Dados do Restaurante</h1>
		<a href="listaRestaurantes" class="btn btn-light">Voltar</a>
		<p>Nome: ${detalheRestaurante.nomeRestaurante}</p>
		<p>CEP: ${detalheRestaurante.numeroCep}</p>
		<p>Número: ${detalheRestaurante.numeroLogradouro}</p>
		<p>Categoria: ${detalheRestaurante.categoriaRestaurante}</p>
		<p>Avaliação (0 - 10): ${detalheRestaurante.avaliacao}</p>
		<p>Quantidade de cozinheiros: ${detalheRestaurante.quantidadeCozinheiros}</p>
		<p>Quantidade de entregadores: ${detalheRestaurante.quantidadeEntregadores}</p>
		<p>Raio de atuação (km): ${detalheRestaurante.raioAtuacaoKm}</p>
		
		
		<h1>Insights</h1>
		<div class="card mb-3">
	  		<div class="card-body">
	   			Faixa de distância com mais pedidos: ${distanciaMaisPedidos.inicioFaixaDistancia} km - ${distanciaMaisPedidos.terminoFaixaDistancia} km
	  		</div>
		</div>
		
		<div class="card mb-3">
	  		<div class="card-body">
	   			Faixa de distância com menos pedidos: ${distanciaMenosPedidos.inicioFaixaDistancia} km - ${distanciaMenosPedidos.terminoFaixaDistancia} km
	  		</div>
		</div>
		
		<div class="card">
	  		<div class="card-body">
	   			<p>Tipo de pedido com mais entregas: ${tipoPedidoMaisEntregas.descricaoTipoPedido}</p>
	   			<p>Tipo de pedido com menos entregas: ${tipoPedidoMenosEntregas.descricaoTipoPedido}</p>
	  		</div>
		</div>
	
	</div>
</body>
</html>