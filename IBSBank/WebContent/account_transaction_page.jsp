<html>
	<head>
	 	<title>Registration Form</title>
	</head>
<body>
	<h1><center>IBS bank</center></h1>
	<jsp:include page="menu.jsp"/>
	<table>
	<h5>Fund Transfers</h5>
			<tr><td>
				Payment From </td>
				<td><input type="textbox" name="fromAccount" required /></td>
			</tr>
			<tr><td>
				Payment To</td>
				<td><input type="textbox" name="toAccount" required /></td>
			</tr>
			<tr><td>
				Amount</td>
				<td><input type="textbox" name="amount" min="1" max="100000" step="1" required /></td>
			</tr>
			<tr><td>AccountType</td> 
			<td>
      	<div class="AccountType">
        <input type="radio" class="radio" name="AccountType" value="savings" id="savings" />
        <label for="savings">Savings</label>
        <input type="radio" class="radio" name="AccountType" value="current" id="current" />
        <label for="current">Current</label>
      </div>
    </td>
			</tr>
			<tr><td>
				Remarks </td>
				<td><input type="text" name="Remarks" /></td>
			</tr>
	<tr><td><button>Transfer Amount</button></td> 
	<td><button>Cancel</button></td> 
			<td><em></em></td>
			</tr>
	</table>
</body>
</html>