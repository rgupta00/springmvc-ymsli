<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add book</title>
</head>
<body>
<form:form action="addbook" method="post" modelAttribute="bookForm">
	<form:hidden path="id"/>
	Isbn: <form:input path="isbn"/><br>
	title: <form:input path="title"/><br>
	author: <form:input path="author"/><br>
	
  city:  <form:select  path="city">
    <form:option value="NONE"> --SELECT--</form:option>
    <form:options items="${cities}"></form:options>
  </form:select>
    <br>
	price: <form:input path="price"/><br>
	pub name: <form:input path="publisher"/><br>
	pub email: <form:input path="pubEmail"/><br>
	pub date: <form:input path="pubDate"/><br>
	BookType: <form:select path="bookType" items="${booktypes}"/><br/>
	<input type="submit" value="Add" />
</form:form>

</body>
</html>