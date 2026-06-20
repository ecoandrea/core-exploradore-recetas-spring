<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle de Receta</title>

<link rel="stylesheet" href="/css/styles.css">
</head>
<body>

<c:choose>

    <c:when test="${not empty nombreReceta}">

        <h1>${nombreReceta}</h1>

        <h3>Ingredientes:</h3>

        <ul>
            <c:forEach var="ingrediente"
                       items="${ingredientes}">
                <li>${ingrediente}</li>
            </c:forEach>
        </ul>

    </c:when>

    <c:otherwise>

        <h2>${mensaje}</h2>

    </c:otherwise>

</c:choose>

<a href="/recetas">Volver</a>

</body>
</html>