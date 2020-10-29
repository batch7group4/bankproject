<html>
	<head>
		<title>Registration Form</title>
	</head>
	<body>
		<h1>IBS Bank</h1>
		<jsp:include page="menu.jsp"/>
		
		<h2>Registration</h2>
		<form action="si" method="POST" >
			<div>
				<label>Full Name: </label>
				<input type="text" name="FullName" required />
			</div>
			<div>
				<label>Gender: </label>
				<select name="gender" id="Gender">
  				<option value="male">Male</option>
 				<option value="female">Female</option>
  				<option value="other">Other</option>
				</select>
			</div>
			<div>
				<label>Date Of Disbursement: </label>
				<input type="date" name="disbursementDate" required />
			</div>
			<div>
				<label>Date Of Payment: </label>
				<input type="date" name="dueDate" required />
			</div>
			<div>
				<button>SEND</button>
			</div>
		</form>
	</body>
</html>