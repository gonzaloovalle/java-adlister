<%--
  Created by IntelliJ IDEA.
  User: Gonzalo
  Date: 1/22/21
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="/guess" method="post">
    <label for="number">Guess a number between 1-3: </label>
    <input type="text" name="number" id="number">
    <button type="submit">Submit</button>
</form>
</body>
</html>
