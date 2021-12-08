<%@page import="Configuracion.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">   
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href=https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>    
        <link rel="icon" href="img/watermelon2.ico" sizes="32x32" type="image/png">
        <link rel="stylesheet" href="css/style.css">
        <style type=»text/css»>
            html, body, div, iframe { margin:0; padding:0; height:100%; }
            iframe { display:block; width:100%; border:none; }
        </style>
        <title>Crea tu Pedido · Feria Virtual</title>
    </head>
    <body style="background-image:url(css/frutilla.jpg);">
        <nav class="navbar navbar-expand-lg navbar-dark bg-danger">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="HomeClienteIN.jsp">Volver al Inicio</a>
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
    <center>
        <div>
            <h3 style="color: white;">Realizar Pago Interno</h3>
        </div>
        <hr>
        <div>
            <form action="Controlador6?menu=Producto" method="POST">
                <a style="color: white;">ID Pago</a>
                <br>
                <input type="text" name="txtid">
                <br>
                <a style="color: white;">IVA</a>
                <br>
                <input type="text" name="txtiva">
                <br>
                <a style="color: white;">Monto Total</a>
                <br>
                <input type="text" name="txtmonto">
                <br>
                <a style="color: white;">ID Usuario</a>
                <br>
                <input type="text" name="txtid_usuario">
                <br>
                <input type="submit" name="accion" value="Guardar">
            </form>
            <!--<div class="card col">
                    <div class="card-body">
                        <center><h3>Registrar Solicitud de Compra Externa</h3></center>
                        <form action="Controlador2?menu=Solicitud_Compra" method="POST">
                            <div class="form-row">
                                
                                <div class="col-sm form-group">
                                    <label>ID Solicitud:</label>
                                    <input type="text"  placeholder=" 1"  name="txtid" class="form-control" onkeypress="return soloNumeros(event)"> 
                                </div>
                                <div class="col-sm form-group">
                                    <label>Descripción:</label>                                
                                   <input type="text"   placeholder="15 k de Frutillas "  name="txtdescripcion" class="form-control">
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-sm form-group">
                                    <label>Fecha de Publicación:</label>
                                    <input type="text" name="txtfecha" placeholder="YYYY-MM-DD"  class="form-control">
                                </div>
                                <div class="col-sm form-group">
                                    <label>ID Usuario</label>
                                    <input type="text"  name="txtcorreousuario" placeholder="aaaa@gmail.com" onkeypress="return soloNumeros(event)" class="form-control">
                                </div>                                
                            </div>
                            <div>
                                <!--<input type="submit" name="accion" value="Guardar">
                                <a type="button" href="Controlador2?menu=Solicitud_Compra&accion=Agregar" id="Agregar" class="btn btn-danger">AGREGAR</a>
                                <a href="Controlador2?menu=Solicitud_Compra&accion=Agregar" type="submit" >AGREGAR SOLICITUD</a>
                            </div>
                        </form>
                    </div>
                </div>-->
        </div>
        <div class="col">
            <table id="myTable" class="table table-bordered display compact" style="width:100%">
                <thead>
                    <tr>
                        <th style="color: white;">ID Pago</th>
                        <th style="color: white;">IVA</th>
                        <th style="color: white;">Monto Total Venta</th>
                        <th style="color: white;">ID Del Usuario</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getId_pago()}</td>
                            <td>${dato.getIva()}</td>
                            <td>${dato.getMonto()}</td>
                            <td>${dato.getId_usuario()}</td>
                            

                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </center>
        
        
        <!-- SCRIPTS !-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>  
        <script>
                                        $(document).on("click", "#Delete", function () {

                                            $('#DeleteModal').modal('hide');
                                        });
        </script> 

        <script>
            $(document).ready(function () {
                $('#myTable').DataTable({
                });

            });
        </script> 

        <script>
            function soloLetras(e) {
                key = e.keyCode || e.which;
                tecla = String.fromCharCode(key).toLowerCase();
                letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
                especiales = "8-37-39-46";

                tecla_especial = false
                for (var i in especiales) {
                    if (key == especiales[i]) {
                        tecla_especial = true;
                        break;
                    }
                }

                if (letras.indexOf(tecla) == -1 && !tecla_especial) {
                    return false;
                }
            }
        </script>
        <script>
            function soloNumeros(evt) {
                var charCode = (evt.which) ? evt.which : event.keyCode
                if (charCode > 31 && (charCode < 48 || charCode > 57))
                    return false;
                return true;
            }
        </script>        

        
    </body>
</html>
