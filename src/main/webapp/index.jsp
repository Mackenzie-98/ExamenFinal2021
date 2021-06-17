<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style-login.css">

</head>
<body>
    <div class="container" id="contenedor">
        <div class="wrapper fadeInDown">
            <div id="formContent">
                <div class="fadeIn first">
                <img src="https://365psd.com/images/istock/previews/9293/92933015-male-user-icon-with-long-shadow-on-white-background.jpg" id="icon" alt="User Icon" />
                </div>
                <form action="<%=request.getContextPath()%>/UsuarioController" method="post">
                <input type="text" id="login" class="fadeIn second" name="username" placeholder="username">
                <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
                <button type="submit" class="next action-button" name = "submit" value="login">Login</button>
                <button type="submit" class="next action-button" name = "submit" value = "redirectRegistrar">Registrarse</button>
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