<%@ import="javax.persistence.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="navbar.jsp"%>
		<h1>This is edit page</h1>
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id"));
		Note note = em.find(Note.class,	noteId);
		%>
</body>
</html>