<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String section =(String)session.getAttribute("section");
%>
<h1>Add Question and Answer</h1>

<form action="insertQuestion">
<label>Enter Question:</label><br><br>
<input type="text" name="q"><br><br>

<label>Enter choice1:</label><br><br>
<input type="text" name="c1"><br><br>

<label>Enter choice2:</label><br><br>
<input type="text" name="c2"><br><br>

<label>Enter ans:</label><br><br>
<input type="text" name="ans"><br><br>

<input type="hidden" name="section" value="<%=section%>">

<button>Add</button>


</form>


</body>
</html>