
<html>
	<head>
	 	<title>IBS Login</title>
	</head>
<body>
	<jsp:include page="menu.jsp"/>
	<!-- <body style="background-color:blue;text-align:center">
    welcome to my page
    </body> -->
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
			
			<tr><td>Role Name</td> 
			<td><em><select name = "">
					<option>Service Provider</option>
					<option>Customer</option>
					</select>	
				</em></td>
			</tr>
			
		</table>
		<br>
			<button type="submit">Login</button>  
			<button type="button" class="cancelbtn"> Cancel</button>
			 <a href="#"> Forgot password? </a>	
		</form>   
</body>
</html>