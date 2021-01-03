<html>

	<head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	<body>
		<div class="container">
			<div class="row">
				
				<div class="col-6">
					
					<form action="<%=request.getContextPath()%>/buscarProducto" method="post">
					  <div class="mb-3">
					    <label for="exampleInputEmail1" class="form-label">Email address</label>
					    <input name="id" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
					    <small id="emailHelp" class="form-text">C&oacute;digo del producto.</small>
					  </div>
				
					  <button type="submit" class="btn btn-primary">Buscar</button>
					</form>
	
				</div>
			
			</div>			
		</div>
	</body>

</html>