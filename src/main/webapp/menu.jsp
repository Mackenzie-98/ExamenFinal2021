<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style-menu.css">

</head>
<body>
	<div class="container" id="contenedor">
		<div class="wrapper fadeInDown">
			<div id="formContent">
				<form action="<%=request.getContextPath()%>/UsuarioController" method="post">
					<h2 class="col-12 fs-title">Menú principal</h2>
					<button type="submit" id="btn-registrarTypedb" name="submit" class="col-12 next action-button" value="redirectTypedb" />Registrar tipo de base de datos</button>
					<button type="submit" id="btn-registrarToken" name="submit" class="col-12 next action-button" value="redirectToken" />Registrar token</button>
					<button type="submit" id="btn-registrarToken" name="submit" class="col-12 next action-button" value="logout" />Cerrar sesión</button>
					</form>
			</div>
		</div>
	</div>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>
</body>
</html>