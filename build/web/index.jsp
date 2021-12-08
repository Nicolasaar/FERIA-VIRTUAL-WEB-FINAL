<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="icon" href="img/watermelon2.ico"  type="image/png">
        <link rel="stylesheet" href="css/style.css">
        <title>Feria Virtual</title>
    </head>
    <body style="background-image:url(css/fruyverd.jpg);" >
        <br>
                    <pre>
                    .
                    .
                    .
                    </pre>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    
                    <form class="form-sign needs-validation" action="ServLogin" method="POST" novalidate>
                        <div class="form-group text-center">
                            <img src="img/Fondo Final Feria Virtual.png" alt="70" width="170"/>
                            <h4>Login</h4>
                        </div>
                        <div class="form-group">
                            <label>Nombre de Usuario:</label>
                            <input type="nom_usuario" pattern="" name="txtNom_usuario" class="form-control" required>
                            <div class="invalid-feedback">
                                Por favor ingrese su nombre de usuario.
                            </div>                            
                        </div>
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <input type="password" name="txtPass" class="form-control" required>
                            <div class="invalid-feedback">
                                Por favor ingrese su contraseña.
                            </div>                             
                        </div>
                        <input type="submit" name="btnAccion" value="Ingresar" class="btn btn-primary btn-block bg-danger">
                    </form>  
                </div>
            </div>
        </div>
        <%
            HttpSession sesion = request.getSession();
            int nivel = 0;
            if (request.getAttribute("nivel") != null) {
                nivel = (Integer) request.getAttribute("nivel");
                if (nivel == 1) {
                    sesion.setAttribute("nom_usuario", request.getAttribute("nom_usuario"));
                    sesion.setAttribute("nivel", nivel);
                    response.sendRedirect("Administrador.jsp");
                }
                if (nivel == 2) {
                    sesion.setAttribute("nom_usuario", request.getAttribute("nom_usuario"));
                    sesion.setAttribute("nivel", nivel);
                    response.sendRedirect("Productor.jsp");
                }
                if (nivel == 3) {
                    sesion.setAttribute("nom_usuario", request.getAttribute("nom_usuario"));
                    sesion.setAttribute("nivel", nivel);
                    response.sendRedirect("Transportista.jsp");
                }
                if (nivel == 4) {
                    sesion.setAttribute("nom_usuario", request.getAttribute("nom_usuario"));
                    sesion.setAttribute("nivel", nivel);
                    response.sendRedirect("ClienteExterno.jsp");
                }
                if (nivel == 5) {
                    sesion.setAttribute("nom_usuario", request.getAttribute("nom_usuario"));
                    sesion.setAttribute("nivel", nivel);
                    response.sendRedirect("HomeClienteIN.jsp");
                }
                if (nivel == 6) {
                    sesion.setAttribute("nom_usuario", request.getAttribute("nom_usuario"));
                    sesion.setAttribute("nivel", nivel);
                    response.sendRedirect("Consultor.jsp");
                }
            }
        %>
    </body>
   
</html>
