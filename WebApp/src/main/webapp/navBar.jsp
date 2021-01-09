<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">JSE,WEB</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/login.jsp">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/nuevoProducto.jsp">Alta Producto</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/buscarProducto">Ver Todos</a>
        </li>
        <li class="nav-item">
        	<a class="nav-link" href="<%=request.getContextPath()%>/cargarProducto.jsp">Cargar desde Archivo</a>
        </li>
            
      <!--   <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Secciones
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="<%=request.getContextPath()%>/nuevoProducto.jsp">Alta Producto</a>
            <a class="dropdown-item" href="<%=request.getContextPath()%>/buscarProducto">Ver Todos</a>
            
            <!-- <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </div>
        </li>-->
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0"  action="<%=request.getContextPath()%>/buscarProducto" method="post"> <!-- ACTION/+METHOD A UN SERVLET =>CONTROLADOR -->
        <input name="id" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>