<%-- 
    Document   : calcularIMC
    Created on : 08/11/2015, 08/11/2015 17:12:20
    Author     : carlo_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular IMC</title>
    </head>
    <body>
        <h1>Resultado do IMC</h1>
        <form>
            Valor do IMC:
            <input type="text" size="10" value="<%= request.getAttribute("imc")%>"<br><br><br>
            Status:
            <input type="text" size="10" value="<%= request.getAttribute("status")%>"<br><br><br>

            <input type="button" value="retornar" onclick="history.back()">
        </form>    
    </body>
</html>
