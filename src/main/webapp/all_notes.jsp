<%@page import="java.io.PrintWriter"%>
<%@page import="javax.persistence.*"%>
<%@page import="java.util.*"%>
<%@page import="com.entities.Note"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes: Note Taker</title>
<%@ include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container">
			<%@ include file="navbar.jsp"%>
			<br>
			<h3 class='text-uppercase'>All Notes:</h3>
			
			<%

				EntityManagerFactory emf = Persistence.createEntityManagerFactory("anand");
				EntityManager em = emf.createEntityManager();
				Query q = em.createQuery("Select n from Note n");
				List<Note> notes = q.getResultList();
				for (Note note : notes) {
					out.print(note + "<br>");
					%>
					<a href="delete?note_id=<%=note.getId() %>" class= "btn btn-danger btn-sm">Delete</a>
					<%-- <a href="edit.jsp?note_id=<%=note.getId() %>" class= "btn btn-success btn-sm">Update</a> --%>
					<br>
					
					<%
				}
				
			%>
			
			
	</div>
</body>
</html>