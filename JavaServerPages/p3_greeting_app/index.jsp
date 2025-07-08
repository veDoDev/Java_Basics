<%@ page import = "java.time.*"  %>

<html>
	<head>
		<title>Greeting app</title>
		<style>
			*{text-align:center;}
			body{backgroud-color:blue;}
		</style>
	</head>
<body>
	<h1> Greeting App </h1>
	<%
		LocalTime t = LocalTime.now();
		int hr = t.getHour();

		if (hr < 12)
			out.println("Good morning");
		else if (hr < 16)
			out.println("Good morning");
		else
			out.println("Good Evening");

	%>
</body>
</html>