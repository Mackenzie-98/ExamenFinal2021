<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style-menu.css">

</head>
<body>
    <div class="container" id="contenedor">
        <div class="wrapper fadeInDown">
            <div id="formContent">
                <div class="fadeIn first">
                <img src="https://i.pinimg.com/originals/77/f2/79/77f2798581e75bb07e12a96df4bd8c49.png" id="icon" alt="User Icon" />
                </div>
                <form action="<%=request.getContextPath()%>/UsuarioController" method="post">
                <button type="submit" class="btn btn-custom btn-lg btn-block mt-3" id="btn-login" name = "submit" value = "login">Login</button>
                <button type="submit" class="btn btn-custom btn-lg btn-block mt-3" id="btn-login" name = "submit" value = "login">Login</button>
                <button type="submit" class="btn btn-custom btn-lg btn-block mt-3" id="btn-login" name = "submit" value = "login">Login</button>
                </form>
                </div>
        
            </div>
     </div>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>
</body>
</html>