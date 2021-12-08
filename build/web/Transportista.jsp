<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>

<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("nivel") == null){
        response.sendRedirect("index.jsp");
    }else{
        String nivel = sesion.getAttribute("nivel").toString();
        if(!nivel.equals("3")){
            response.sendRedirect("index.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">      
        <link rel="icon" href="img/watermelon2.ico" sizes="32x32" type="image/png">
        <link rel="stylesheet" href="css/style.css">
        <style type=»text/css»>
            html, body, div, iframe { margin:0; padding:0; height:100%; }
            iframe { display:block; width:100%; border:none; }
        </style>
        <title>Home ·Feria Virtual</title>
    </head>
    <body style="background-image:url(css/camiones.jpg);">
        <nav class="navbar navbar-expand-lg navbar-dark bg-danger" >
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="#">Home Transportista</a>
                    </li>
                    <li class="nav-item">                                    
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador4?menu=Visualizar_Compra&accion=Listar">Despachar Productos</a>
                    </li>
                   
                    </li>
                   
                     
                </ul>
            </div>
            <div>
                <ul class="navbar-nav">
                     
                </ul>
            </div>
            <div class="btn-group">
                <button type="button" style="border: none" class="btn btn-outline-light dropdown-toggle" data-toggle="dropdown" data-display="static" aria-haspopup="true" aria-expanded="false">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="dropdown-menu dropdown-menu-lg-right text-center">
                    
                    <a class="dropdown-item">
                        <img src="img/icono_user.png" alt="60" width="60"/>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="index.jsp?cerrar=true">Cerrar Sesión</a>
                </div>
            </div>                  
        </nav>
        
        
        
        <!-- SCRIPTS !-->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
