<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recetas</title>

<link rel="stylesheet" href="/css/styles.css">
</head>
<body>

<h1>Lista de Recetas</h1>

<ul>
    <c:forEach var="receta" items="${listaRecetas}">
        <li>
            <a href="/recetas/${receta}">
                ${receta}
            </a>
        </li>
    </c:forEach>
</ul>

</body>
</html>