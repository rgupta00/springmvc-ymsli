<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>

<meta charset="UTF-8">
<title>add book</title>
</head>
<body>
<form:form action="addbook" method="post" modelAttribute="bookForm">
	<form:hidden path="id"/>
	Isbn: <form:input path="isbn"/><form:errors path="isbn" class="error"/><br>
	title: <form:input path="title"/><form:errors path="title" class="error"/><br>
	author: <form:input path="author"/><form:errors path="author" class="error"/><br>
	
  city:  <form:select  path="city">
    <form:option value="NONE"> --SELECT--</form:option>
    <form:options items="${cities}"></form:options>
   </form:select>
    <br>
	price: <form:input path="price"/><form:errors path="price" class="error"/><br>
	pub name: <form:input path="publisher"/><form:errors path="publisher" class="error"/><br>
	pub email: <form:input path="pubEmail"/><form:errors path="pubEmail" class="error"/><br>
	pub date: <form:input path="pubDate"/><form:errors path="pubDate" class="error"/><br>
	BookType: <form:select path="bookType" items="${booktypes}"/><br/>
	<input type="submit" value="Add" />
</form:form>

</body>
</html>