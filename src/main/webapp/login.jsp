<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp_f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>SPRING SECURITY</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
		    <div class="panel">
		       <div class="panel-heading">
		          <h2>Login into your account</h2>
		       </div>
		       <div class="panel-body">
			          <sp_f:form method="POST" modelAttribute="user" class="form">
			              <spring:bind path="username">
			                 <sp_f:input type="text" path="username" class="form-control" placeholder="Enter your username here"></sp_f:input>
			                 <sp_f:errors path="username"></sp_f:errors>
			              </spring:bind>
			              <spring:bind path="password">
			                 <sp_f:input type="password" class="form-control" path="password" placeholder="Enter your password here"></sp_f:input>
			                 <sp_f:errors path="password"></sp_f:errors>
			              </spring:bind>
			              
			              <button type="submit" class="btn btn-lg btn-block btn-primary">Login</button>
			          </sp_f:form>
		       </div>
		    </div>
		</div>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>	
	</body>
</html>