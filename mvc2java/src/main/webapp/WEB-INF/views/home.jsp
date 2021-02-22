<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/demo.css" rel="stylesheet">
<script src="<c:url value="/resources/js/demo.js" />"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <h2>Hi this style is defined in css file</h2>
 
    <P>The time on the server is ${serverTime}.</P>
 
    <br>
    <br>
 
    <img
        src="${pageContext.request.contextPath}/resources/images/sp.png" />
 
    <br>
    <br>
 
    <input type="button" onclick="doSomeWork()" value="Click Me" />
</body>
</html>