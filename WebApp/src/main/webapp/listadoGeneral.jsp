<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.List"%>
<html>
	<head>
		<%@include file="head.jsp" %>
	</head>
		
	<body>
	
		<%@include file="navBar.jsp" %>
	
		<div class="container">
			<!-- Productos OK -->
			<div class="row">
				<div class="alert alert-sucess">Productos Dados de Alta</div>
				<table class="table">
					<thead>
						<tr>
								<th scope="col">ID</th>
								<th scope="col">DESCRIPCION</th>
								<th scope="col">PRECIO</th>
								<th scope="col">CODIGO</th>
								<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<%List<Producto> productos= (List<Producto>)request.getAttribute("listadoOK");%>
						<%for (Producto item : productos) {%>
						
							<tr>
								<th scope="row"><%=(item.getId())%></th>
								<th scope="row"><%=(item.getDescripcion())%></th>
								<th scope="row"><%=(item.getPrecio())%></th>
								<th scope="row"><%=(item.getCodigo())%></th>
								<th>
									<button type="button" class="btn btn-outline-primary">Editar</button>
									<button type="button" class="btn btn-outline-secondary">Eliminar</button>
								</th>				
							</tr>							
						<%}%>
					</tbody>
				
				</table>
			</div>
			
			
			<!-- Productos OK -->
			<div class="row">
				<div class="alert alert-sucess">Productos con Errores</div>
				<table class="table">
					<thead>
						<tr>
								<th scope="col">ID</th>
								<th scope="col">DESCRIPCION</th>
								<th scope="col">PRECIO</th>
								<th scope="col">CODIGO</th>
								<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<%List<Producto> productosFail= (List<Producto>)session.getAttribute("listadoFail");%>
						<%for (Producto item : productosFail) {%>
						
							<tr>
								<th scope="row"><%=(item.getId())%></th>
								<th scope="row"><%=(item.getDescripcion())%></th>
								<th scope="row"><%=(item.getPrecio())%></th>
								<th scope="row"><%=(item.getCodigo())%></th>
								<th>
									<button type="button" class="btn btn-outline-primary">Editar</button>
									<button type="button" class="btn btn-outline-secondary">Eliminar</button>
								</th>				
							</tr>							
						<%}%>
					</tbody>
				
				</table>
			</div>
			<%if(!productosFail.isEmpty()){ %>
			<div class="row">
				<form action="<%=request.getContextPath()%>/generarArchivoErrorServlet" method="post" target="_new">
					<button type="submit" class="btn btn-primary">Generar Listado Error</button>
				</form>
			</div>
			<%}%>
			
		</div>
	
	</body>


</html>