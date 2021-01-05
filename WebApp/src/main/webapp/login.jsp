<html>

	<head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	<body>
		<div class="container">
			<div class="row">
				
				<div class="col-6">
					
					<form action="<%=request.getContextPath()%>/LoginServlet" method="get">
					  <div class="mb-3">
					    <label for="exampleInputEmail1" class="form-label">UserName</label>
					    <input name="userNameId" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputEmail2" class="form-label">Password</label>
					    <input name="passwordId" type="password" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp">
					  </div>
				
					  <button type="submit" class="btn btn-primary">Aceptar</button>
					</form>
	
				</div>
			
			</div>			
		</div>
	</body>

</html>


