<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; }
        form { margin: 20px auto; width: 300px; padding: 20px; border: 1px solid #ccc; border-radius: 5px; }
        input { display: block; width: 100%; margin-bottom: 10px; padding: 8px; }
        button { width: 100%; padding: 8px; background: #28a745; color: white; border: none; }
    </style>
</head>
<body>
<h2>Registro de Usuario</h2>
<form action="http://localhost:8080/auth/register" method="post">
    <label>user:</label>
    <input type="username" name="username" required><br>
    <label>Contraseña:</label>
    <input type="password" name="password" required><br>
    <button type="submit">Registrarse</button>
</form>
</body>
</html>
