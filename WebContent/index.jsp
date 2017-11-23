<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Mail</title>
</head>
<body bgcolor="salmon">
<h3>Welcome to Gmail Subscription!</h3>

<form action="SendMailServlet" method="post">

<em>Username :</em> <input type="text" id="un" name="un"><br>
<em>Password :</em>  <input type="text" id="pw" name="pw"><br>
<em>Mail id :</em>  <input type="text" id="toun" name="toun"><br>
<button type="submit">Subscribe</button>
</form>
</body>
</html>