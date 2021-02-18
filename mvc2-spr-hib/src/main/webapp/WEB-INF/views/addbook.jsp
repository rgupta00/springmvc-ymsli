<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add book controller</title>
</head>
<body>
<form action="bookController" method="post">
    ISBN : <input type="text" name="isbn" value="" size="15"/> <BR>
	Title : <input type="text" name="title" value="" size="50"/> <BR>
	Author : <input type="text" name="author" value="" size="50"/> <BR>
	Price : <input type="text" name="price" value="" size="10"/> <BR>
	<input type="submit" value="Add" />
</form>
</body>
</html>