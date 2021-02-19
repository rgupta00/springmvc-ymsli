<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">

		<thead>
			<tr>
				<th>id</th>
				<th>isbn</th>
				<th>title</th>
				<th>author</th>
				<th>author city</th>
				<th>price</th>
				<th>pub name</th>
				<th>pub email</th>
				<th>pub date</th>
				<th>book type</th>
				<th>update</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.id }</td>
					<td>${book.isbn }</td>
					<td>${book.title }</td>
					<td>${book.author }</td>
					<td>${book.city }</td>
					<td>${book.price }</td>
					<td>${book.publisher }</td>
					<td>${book.pubEmail }</td>
					<td>${book.bookType }</td>
					<td><fmt:formatDate value="${book.pubDate }" pattern="dd/MM/yyyy"/></td>
					<td><a href="update?id=${book.id }">update</a></td>
					<td><a href="delete?id=${book.id }">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="addbook">addbook</a>
</body>
</html>