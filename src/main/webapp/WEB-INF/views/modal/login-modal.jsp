<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<div class = row>
	<h1 align="center">BUYCO</h1>
</div>
<div class = row style="margin:auto">
	<div class="col-md-8">
   	<form id="login_form" style="float:	right">
   		<fieldset style = "width:300">
   			<input type="email" id="input_email" class="form-control" name="input_email" placeholder="email" maxlength="100" required="true"><br/>
			<input type="password" id="input_password" class="form-control" name="input_password" placeholder="Password" maxlength="100" required="true"><br/>
		</fieldset>
	</form>
	</div>
	<div class="col-md-4">
   		<input type="button" class="btn btn-primary" onclick="login()" value="LOG IN" style="height:90px; float: left; margin-bottom: 10px">
	</div>
</div>
<center>
	<input type="button" class="btn btn-danger" onclick="payco_login()" value="PAYCO" style="width:300px; margin-bottom: 10px">
	<input type="button" class="btn btn-primary" onclick="facebook_login()" value="FACEBOOK" style="width:300px; margin-bottom: 10px">
	<input type="button" class="btn btn-primary" onclick="signin()" value="SIGN IN" style="width:300px; margin-bottom: 10px">
</center>
<script src="resources/js/showModalDialogCallee.js"></script>
    