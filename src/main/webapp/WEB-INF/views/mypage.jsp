<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<tag:main-header>
	<body>
		<div class="container" id="name">
		</div>
	</body>
	<script src="resources/js/script.js"></script>
	<script>
		$("#name").append('<p id="textemail"> This is MY Page!!</p>');
	</script>
</tag:main-header>