<html>

	<head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	<body>
		<div class="container">
		<%@include file="navBar.jsp" %>
			<div class="row">
				
				<div class="col-6">
					
					<form action="<%=request.getContextPath()%>/parseArchivoServlet" method="post" enctype="application/x-www-form-urlencoded" >
						<div class="form-group">
							<label for ="exampleFormControlFile1">Selecciones archivo de productos</label>
							<input name="file" type="file" class ="form-control-file" id="exampleFormControlFile1">
						</div>
						<button type="submit" class="btn btn-primary">Procesar</button>
					</form>
	
				</div>
			
			</div>			
		</div>
	</body>

</html>
