<html>
	<head>
		<%@include file ="head.jsp" %>
	</head>

	<body>
		<div class="container">
		
			<div class="row">
				<div class ="col-6">
					<form action="<%=request.getContextPath()%>>/nuevoProducto" method="post">
						<div class="form-group">
							<label	for="exampleInputEmail1">Descripcion</label>
							<input name="descripcion" type="text" class="form-control" id="exampleInputEmail1">
						</div>
						<div class="form-group">
							<label	for="exampleInputPassword1">Precio</label>
							<input name="precio" type="number" class="form-control" id="exampleInputPassword1">
						</div>
						<div class="form-group">
							<label	for="exampleInputPassword1">Codigo</label>
							<input name="codigo" type="text" class="form-control" id="exampleInputPassword1">
						</div>
					
						<button type="button" class="btn btn-primary">Sumbit</button>
					</form>
				
				
				</div>
			</div>
		</div>
	
	
	</body>

</html>