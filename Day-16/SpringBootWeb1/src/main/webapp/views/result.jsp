<%@page language="java" %>
<html>
<head>

</head>
<body>
<h1>

</h1>
<form action="add">
<label for="num1">Enter 1st Number :</la bel>
<label type="text" id="num1" name="num1" ></label>
<label for="num2">Enter 2nd Number :</label>
<label type="text" id="num2" name="num2" ></label>
<input type="submit" value="Submit">
<h2>Result is:<%= session.getAttribute("result")%></h2>
<h2>Result is:<%= session.getAttribute("result")%></h2>
</form>
</body>
</html>