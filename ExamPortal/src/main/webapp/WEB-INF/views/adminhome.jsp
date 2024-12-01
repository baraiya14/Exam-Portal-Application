<%@page import="com.MainApp.Pojo.Section"%>
<%@page import="java.util.List"%>
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
String check =(String)session.getAttribute("check");
List<Section> als = (List<Section>)session.getAttribute("als");
if(check!= null)
{
%>
<h1>Admin home page</h1>
<a href="logout">Logout</a>

<form action="addSection">

<label>Enter Section Id:</label><br><br>
<input type="text" name="id"><br><br> 

<label>Enter Section Name:</label><br><br>
<input type="text" name="section"><br><br>

<input type="hidden" name="adname" value="<%=check%>">
<button>Add</button>

</form>


<%
for(int i = 0; i < als.size(); i++)
{
%>


<h1></h1>
<form action="addQuestion">
<input type="hidden" name="section" value="<%=als.get(i).getSection() %>">
<button><%=als.get(i).getSection() %></button>
</form>

<%}%>

<%
}
else
{
	response.sendRedirect("/WEB-INF/views/adminlogin.jsp");
}
%>

</body>
</html>