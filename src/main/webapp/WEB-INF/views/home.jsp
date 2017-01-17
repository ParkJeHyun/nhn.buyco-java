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
		ajax_hanlder('/buyco/api/user/list','GET', function (responseData) {
    	
			$("#name").append('<p id="textemail">' + responseData[0].name +'</p>');
    	
		});
	</script>
</tag:main-header>