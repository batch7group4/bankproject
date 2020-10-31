<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="float:center;width:400px; background:#FFFFFF; margin:0 auto;">
<tr >
    
    <td width="1000" valign="top">
    	<div id="welcome" style="border-right:#666666 1px dotted;"><h1>Account Summary</h1><br>
    	    <table  align="center-top" bgcolor="white">
		<tr>
			
		</tr>
		<tr>
			<td>
				<form name=F1 onSubmit="return dil(this)" action="CreateServlet" >
				  <table cellspacing="5" cellpadding="3">	
				
					<tr><td>USER NAME:</td><td> <input type="text" name="username"/></td></tr>
					<tr><td>PASSWORD:</td><td> <input type="password" name="password"/></td></tr>
					<tr><td>RE-PASSWORD:</td><td> <input type="password" name="repassword"/></td></tr>
					<tr><td>AMOUNT:</td><td> <input type="text" name="amount"/></td></tr>
					<!-- Gender:<br/><br/>
					Male<input type="radio" name="gender" value="male"> Female<input type="radio" name="gender" value="female"/><br/><br/> -->
					<tr><td>ADDRESS:</td><td> <input type="text" name="adderess"/></td></tr>
					<tr><td>PHONE:</td><td> <input type="text" name="phone"/></td></tr>
					<tr><td></td><td><input type="submit" value="Submit"/>
					
					<INPUT TYPE=RESET VALUE="CLEAR"></td></tr>
					</table>
               		</form>
			</td>
		</tr>
	
	</table>

</body>
</html>