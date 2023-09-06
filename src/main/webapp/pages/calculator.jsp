<%--
  Created by IntelliJ IDEA.
  User: Notebook
  Date: 21.08.2023
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/calculator" method="post">
    <input type="text" name="num1" placeholder="Number1">
    <input type="text" name="num2" placeholder="Number2">
    <input type="text" name="type" placeholder="Type">
    <button>Submit</button>
</form>

<form action="${pageContext.request.contextPath}/calculator" method="post">
    <%--@declare id="type"--%><input type="text" name="values" placeholder="values">
    <label for="type"> enter your operation</label>
    <select id="type" name="type">
        <option value="SUM">SUM</option>
        <option value="ABS">ABS</option>
        <option value="COS">COS</option>
        <option value="DIV">DIV</option>
        <option value="FLOOR">FLOOR</option>
        <option value="LOG">LOG</option>
        <option value="MUL">MUL</option>
        <option value="SIN">SIN</option>
        <option value="SUB">SUB</option>
        <option value="TAN">TAN</option>
    </select>
        <button>Submit</button>
</form>
<h2>${result}</h2>
<h2>${message}</h2>
</body>
</html>
