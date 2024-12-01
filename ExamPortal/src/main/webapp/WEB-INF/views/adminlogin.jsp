<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Admin login Page</h1>

<form action="adlogin" method="post">

<label>Enter username</label><br><br>
<input type="text" name="username"><br><br>

<label>Enter Password</label><br><br>
<input type="password" name="password"><br><br>


<button>Login Up</button>

</form>

<a href="/webapp/WEB-INF/views/adminsignup.jsp">click here to signup</a>

</body>
</html>