
<%@page import="co.reposteria.model.Typedb"%>
<%@page import="co.reposteria.dao.TypedbDao"%>
<%@page import="co.reposteria.model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="co.reposteria.dao.UsuarioDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style-registrar-token.css">
<title>Registrar Tokens</title>

</head>

<body>

	<div class="container" id="contenedor">
		<div class="wrapper fadeInDown">
			<div id="formContent">
				<form action="<%=request.getContextPath()%>/TokenController"
					method="post">
					<h2 class="fs-title">Registar Token</h2>
 <input type="text" name="host" placeholder="Host" required /> <input
						type="text" name="userdb" placeholder="Userdb" required />
						<input type="text" name="pass" placeholder="Password" required />
						<input type="text" name="db" placeholder="Database"required />
						<input type="text" name="token" placeholder="Token"required />
						<input type="text" name="port" placeholder="Port"required />
						<input type="text" name="state" placeholder="State"required />
											<select class="form-control" name="user_id">
						<option disabled="disabled" selected="selected">Seleccione
							el usuario</option>
						<%
						UsuarioDao uDao = new UsuarioDao();
						List<Usuario> users = uDao.list();
						if (users != null)
							for (Usuario u : users) {
						%>
						<option value="<%=u.getId()%>"><%=u.getUsuario()%></option>
						<%
						}
						%>
					</select> <select class="form-control" name="type" required>
						<option disabled="disabled" selected="selected">Seleccione
							el tipo de database</option>
						<%
						TypedbDao tDao = new TypedbDao();
						List<Typedb> tipos = tDao.list();
						if (tipos != null)
							for (Typedb t : tipos) {
						%>
						<option value="<%=t.getId()%>"><%=t.getDescription()%></option>
						<%
						}
						%>
					</select>
						<button type="submit" id="btn-registrar" name="submit"
						class="next action-button" value="registrar" />
					Registrar
					</button>
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