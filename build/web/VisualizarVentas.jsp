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
    <body style="background-image:url(css/mar.jpg);">
         <div>
           
        </div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-danger">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="Transportista.jsp">Volver al Inicio</a>
                    </li>
                    
                </ul>
            </div>
            <div>
                <ul class="navbar-nav">
                  <div>
          
        </div>   
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
            <div>
            <h3>Visualización de Pedidos</h3>
        </div>
        </div>
        <div class="col">
            <table id="myTable" class="table table-bordered display compact" style="width:100%">
                <thead>
                    <tr>
                        <th>N°</th>
                        <th>Detalles</th>
                        <th>Estado</th>
                        <th>Monto</th>
                        <th>Fecha</th>
                        <th>Correo del cliente</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getId_venta_interna()}</td>
                            <td>${dato.getDetalles()}</td>
                            <td>${dato.getEstado()}</td>
                            <td>${dato.getMonto()}</td>
                            <td>${dato.getFecha()}</td>
                            <td>${dato.getNombre_usuario_responsable()}</td>
                            <td>
                                <a class="btn btn-danger fa " data-toggle="modal" data-target="#DeleteModal${dato.getId_venta_interna()}">DESPACHAR</a>        

                                        <!-- Modal -->
                                        <div class="modal fade" id="DeleteModal${dato.getId_venta_interna()}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                            <div class="modal-dialog" role="document">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLabel">Entregar Pedido?</h5>
                                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                            <span aria-hidden="true">&times;</span>
                                                        </button>
                                                    </div>
                                                    <div class="modal-body">
                                                        El pedido se marcará como entregado. ¿Desea continuar?
                                                    </div>
                                                    <div class="modal-footer">
                                                        <a type="button" href="index.jsp" id="Delete" class="btn btn-danger">Despachar</a>
                                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                            </td>

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
