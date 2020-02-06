<!DOCTYPE html>

<html>
	<head>
		<title>WebApps 2A - Index</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		</style>
	</head>

	<body>
	Welcome to WebApps 2A! Select a gamemode.
	<form action="${pageContext.servletContext.contextPath}/addNumbers" method="get">
	<input type="Submit" name="submit" value="Add Numbers!">
		</form>
	
	<form action="${pageContext.servletContext.contextPath}/multiplyNumbers" method="get">
	<input type="Submit" name="submit" value="Multiply Numbers!">
		</form>
		
		<form action="${pageContext.servletContext.contextPath}/guessingGame" method="get">
	<input type="Submit" name="submit" value="Guessing Game!">
		</form>
	
				
	
	
	</body>
</html>
