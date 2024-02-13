<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Note Taker : Add Note</title>
<%@ include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container">
		<%@ include file="navbar.jsp"%>
		<br>
		<h1>Please fill your note detail</h1>
		<br>


		<!-- THIS IS ADD FORM -->
		<form action="save" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Note title</label> 
				<input
				name="title"
					required type="text" class="form-control" id="title"
					 placeholder="Enter here"/>

			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" id="content"  placeholder="Enter your content here"
					class="form-control" style="height: 200px">
				</textarea>
			</div>
			<div class="container text-centre">
				<button type="submit" class="btn btn-primary">Add</button>

			</div>
		</form>
	</div>
</body>
</html>