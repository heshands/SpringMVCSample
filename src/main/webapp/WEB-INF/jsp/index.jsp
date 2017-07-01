<!DOCTYPE HTML>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<title>Boot Sample | Home</title>

<link href="static/css/bootstrap.min.css" rel="stylesheet">


</head>

<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<!--  <a href="#" class="navbar-band">Bootsample</a>-->
			<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
			<li><a href="#">Manage Task</a></li>
			<li><a href="person-list">All Task</a></li>
			</ul>
		</div>
	  </div>
	</div>
	
	<div class ="container tesxt-cetner" id ="tasksDiv">
	<h3>My Tasks</h3>
	<hr>
	<div class="table-responsive">
	<table class="table table-striped table-bordered">
	<thead>
	<tr>
			<th>Id</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Course</th>
			<th>Enrolled date</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="task" items="${tasks}">
	<tr>
	<td>${task.id}</td>
	<td>${task.fname}</td>
	<td>${task.lname}</td>
	<td>${task.course}</td>
	<td>${task.enrolledDate}</td>
	
	</tr>
	</c:forEach>
	</tbody>
	</table>
	
	</div>
	</div>
	<script src="static/js/bootstrap.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/npm.js"></script>
</body>
</html>