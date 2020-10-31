<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Account Summary Page</title>
</head>
<body>
<h1><center>IBS bank</center></h1>
	<jsp:include page="menu.jsp"/>
	<h2>Quick Links</h2>
	


<div id="navigation">
    <ul>
    <li><a href="account_statetment_page.jsp">Account Statement</a></li>
    <li><a href="account_transaction_page.jsp">Fund Transfer</a></li>
    <li><a href="balance1.jsp">BALANCE</a></li>
    <li><a href="deposit1.jsp">DEPOSIT</a></li>
    <li><a href="withdraw1.jsp">WITHDRAW</a></li>
    <li><a href="transfer1.jsp">TRANSFER</a></li>
    <li><a href="bill_payments.jsp">Bill Payments</a></li>
    <li><a href="about.jsp">ABOUT US</a></li>
    </ul>
    <jsp:include page="test2include.jsp"/>
</div>




	<jsp:include page="Logout_page.jsp"/>

	
</body>
</html>