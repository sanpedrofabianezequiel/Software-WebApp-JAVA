<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.Collection"%>
<html>

<body>


	<%
	
		Collection<Producto> productos=(Collection<Producto>)request.getAttribute("key");
	
		out.print("<ul>");
		for(Producto item : productos){
			out.print("<li>");
			out.print(item.getCodigo());
			out.print("--");
			out.print(item.getDescripcion());			
			out.print("</li>");
		}
		
		out.print("</ul>");
	%>
	
	
	<a href="<%=request.getContextPath()%>">Volver al inicio</a>

</body>

</html>