
<html>
	<head>
	 	<title>IBS Login</title>
	</head>
<body>
	<h1><center>IBS bank</center></h1>
	<jsp:include page="menu.jsp"/>
	
	
    <form>  
    <table style="with: 50%">

			<tr>
				<td>UserName</td>
				<td><input type="text" placeholder="Enter Username"  name="username" required  /></td>

			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" placeholder="Enter Password" name="password"	required/></td>
			</tr>
		</table>
		<br>
			<button type="submit">Login</button>  
			<button type="button" class="cancelbtn"> Cancel</button>
			 <a href="#"> Forgot password? </a>	
		</form>   
</body>
</html>