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
    <input type="text" name="values" placeholder="values">
    <input type="text" name="type" placeholder="ABS, COS, DIV, FLOOR, LOG, MUL, SIN, SUB, SUM, TAN">
    <button>Submit</button>
</form>
<h2>${result}</h2>
<h2>${message}</h2>

</body>
</html>
