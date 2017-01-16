<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>

<script src="resources/jquery/jquery-3.1.1.min.js"></script>
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
<script src="resources/js/script.js"></script>
<script>
	ajax_hanlder('/buyco/api/user/list','GET', function (responseData) {
    	for(idx in responseData) {
    		document.write(responseData[idx].name);
    	}
	});
</script>