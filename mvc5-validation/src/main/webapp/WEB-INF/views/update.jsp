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
<form:form action="updatebook" method="post" modelAttribute="bookForm">
	<form:hidden path="id"/>
	Isbn: <form:input path="isbn" readonly="true"/><br>
	title: <form:input path="title" readonly="true"/><br>
	author: <form:input path="author" readonly="true"/><br>
	city:  <form:select  path="city">
    <form:option value="NONE"> --SELECT--</form:option>
          <form:options items="${cities}"></form:options>
     </form:select>
    <br>
	price: <form:input path="price"/><br>
	pub name: <form:input path="publisher" readonly="true"/><br>
	pub email: <form:input path="pubEmail" readonly="true"/><br>
	pub date: <form:input path="pubDate" readonly="true"/><br>
	BookType: <form:select path="bookType" items="${booktypes}"/><br/>
	<input type="submit" value="Add" />
</form:form>

</body>
</html>