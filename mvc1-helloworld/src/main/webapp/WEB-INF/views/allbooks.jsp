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
	<table>

		<thead>
			<tr>
				<th>id</th>
				<th>isbn</th>
				<th>title</th>
				<th>author</th>
				<th>price</th>
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
					<td>${book.price }</td>
					<td><a href="update?id=${book.id }">update</a></td>
					<td><a href="delete?id=${book.id }">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>