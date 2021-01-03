<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.Collection"%>
<html>
	<head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>

	<div class="container">
		<div class="row">
			<div class="col-12">
			
			
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">Id</th>
					      <th scope="col">Codigo</th>
					      <th scope="col">Descripci&oacute;n</th>
					      <th scope="col">Precio</th>
					    </tr>
					  </thead>
					  <tbody>
					  
					  	<%Collection<Producto> pds=(Collection<Producto>) session.getAttribute("productos"); %>
					  
					  	<%for(Producto item : pds){	%>		
					  
						  	 <tr>
						      <th scope="row"><%=item.getId()%></th>
						      <td><%=item.getCodigo()%></td>
						      <td><%=item.getDescripcion()%></td>
						      <td><%=item.getPrecio()%></td>
						    </tr>
					  	
					  	<%}%>

					  </tbody>
					</table>
			
			</div>
			
			<div class="col-12">
				<a href="<%=request.getContextPath()%>/logoutServlet">Logout</a>
			</div>
		</div>
	
	</div>


</html>