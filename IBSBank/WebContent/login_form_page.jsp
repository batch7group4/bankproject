
<html>
	<head>
	 	<title>IBS Login</title>
	 	<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
<body>
	<jsp:include page="menu.jsp"/>
	
	 <form action="Login" method="POST">  
    <table>

			<tr>
				<td>UserName</td>
				<td><input type="text" placeholder="Enter Username"  name="username" required  /></td>
				
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" placeholder="Enter Password" name="password"	required/></td>
			</tr>
			
			<!-- <tr><td>Role Name</td> 
			<td><em><select name = "">
					<option>Service Provider</option>
					<option>Customer</option>
					</select>	
				</em></td>
			</tr> -->
			
		</table>
	
			<button type="submit">Login</button>  
			<button type="button" class="cancelbtn"> Cancel</button>
			 <a href="#"> Forgot password? </a>	
		</form>   
</body>
</html>