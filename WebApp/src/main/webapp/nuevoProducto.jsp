<html>
	<head>
		<%@include file ="head.jsp" %>
	</head>

	<body>
		<div class="container">
		
			<div class="row">
				<div class ="col-6">
					<form action="<%=request.getContextPath()%>/nuevoProducto" method="post">
						<div class="form-group">
							<label	for="exampleInputEmail1">Descripcion</label>
							<input name="descripcion" type="text" class="form-control" id="exampleInputEmail1">
						<%
							String errorDescipcion= (String)request.getAttribute("errorDescripcion");
							if(errorDescipcion != null){
						 %>	
						 
							<div class="alert alert-danger" role="alert">
						 		<%=errorDescipcion%>
						 	</div>
						 
						 	
						 <%
							}
						 %>
						
						</div>
						<div class="form-group">
							<label	for="exampleInputPassword1">Precio</label>
							<input name="precio" type="number" class="form-control" id="exampleInputPassword1">
						</div>
						<%
							String errorPrecio= (String)request.getAttribute("errorPrecio");
							if(errorPrecio != null){
						 %>	
						 
						 	<div class="alert alert-danger" role="alert">
						 		<%=errorPrecio%>
						 	</div>
						 
						 	
						 <%
							}
						 %>
						<div class="form-group">
							<label	for="exampleInputPassword2">Codigo</label>
							<input name="codigo" type="text" class="form-control" id="exampleInputPassword2">
						</div>
					
						<button type="submit" class="btn btn-primary">Nuevo Producto</button>
					</form>
				
				
				</div>
			</div>
		</div>
	
	
	</body>

</html>