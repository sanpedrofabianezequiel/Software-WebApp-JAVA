<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<html>
	<head>
<!-- 	Agregamos CSS-->
<jsp:include page="head.jsp"></jsp:include>
<script type="text/javascript">
	function mostrarOpcion(obj){
		alert(obj);
	}
</script>
	</head>
	
						<%
						Map<Integer,String> mapPaises= new HashMap<Integer,String>();
						mapPaises.put(1, "Argentina");
						mapPaises.put(2, "Brasil");
						mapPaises.put(3, "Chile");
						mapPaises.put(4, "Peru");
						%>
		<body>
		
			<div class="container">
					<div class="row">
						<div class="col-12">	
							<select onselect="mostrarOpcion(this);">
								<%
									//Para recorrer/iterar un Map Usamos EntrySet sobre la variable Map
									Set<Map.Entry<Integer,String>>	paiseIterables=mapPaises.entrySet();
									
									for(Map.Entry<Integer,String>  item : paiseIterables){
										//Key y values son obtenibles
								%>
										<option value="<%=item.getKey()%>"> <%=item.getKey() + " - " + item.getValue()%>  </option>
								<%
									}
								%>
							</select>
						</div>		
					</div>
			</div>
		</body>
</html>