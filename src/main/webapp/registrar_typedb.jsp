
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style-registrar-typedb.css">
<title>Registrar Tipo Database</title>

</head>

<body>

	<div class="container" id="contenedor">
		<div class="wrapper fadeInDown">
			<div id="formContent">
					<form action="<%=request.getContextPath()%>/TypedbController"
					method="post">
						<h2 class="fs-title">Registrar tipo de base de datos</h2>
						<input type="text" name="id" placeholder="ID" required /> 
						<input type="text" name="description" placeholder="Descripcion" required /> 
						<input type="text" name="driver" placeholder="Driver" required /> 
						<input type="text" name="aditional" placeholder="Aditional" required /> 
						<button type="submit" id="btn-registrar" name="submit" class="next action-button" value="registrar" />Registrar</button>
					</form>
			</div>
		</div>
	</div>

	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js"
		type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js"
		type="text/javascript"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>