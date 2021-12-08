/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Solicitud_CompraInterna;
import Modelo.Solicitud_CompraINTDAO;
import Modelo.Reporte_Transportes;
import Modelo.Reporte_TransportesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Nicolás
 */
public class Controlador31 extends HttpServlet {
    
    ProductoDAO dao = new ProductoDAO();
    Producto p = new Producto();
    Solicitud_CompraINTDAO sdao = new Solicitud_CompraINTDAO();
    Solicitud_CompraInterna s = new Solicitud_CompraInterna();
    Reporte_TransportesDAO vdao = new Reporte_TransportesDAO();
    Reporte_Transportes v = new Reporte_Transportes();

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("HomeClienteIN.jsp").forward(request, response);
        }
        
        //Visulizar Reportes
        if (menu.equals("Visualizar_Reportes")) {
        switch (accion){
            case "Listar":
                List<Reporte_Transportes>datos = vdao.listar();
                request.setAttribute("datos", datos);
                
                break;
            default:
                throw new AssertionError();
        }
        request.getRequestDispatcher("VisualizarReportes.jsp").forward(request, response);
        }
        
        
        //Solicitud Compra
        if (menu.equals("Solicitud_CompraInterna")) {
            switch (accion){
                case "Listar":
                    List<Solicitud_CompraInterna>datos = sdao.listar();
                    request.setAttribute("datos", datos);
                    request.getRequestDispatcher("SolicitudCompraInterno.jsp").forward(request, response);
                    break;
                case "Agregar":
                    String id = request.getParameter("txtid");
                    String descrip = request.getParameter("txtdesc");
                    String fecha = request.getParameter("txtfech");
                    String correo = request.getParameter("txtid_usuario");
                    s.setId_solicitud(Integer.parseInt(id));
                    s.setDescripcion(descrip);
                    s.setFecha(fecha);
                    s.setNombre_usuario(correo);
                    sdao.agregar(s);
                    request.getRequestDispatcher("SolicitudCompraInterno.jsp").forward(request, response);
                    break;
                    
                default:
                    throw new AssertionError();
            }
        request.getRequestDispatcher("SolicitudCompraInterno.jsp").forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion){
            case "Guardar":
                String id = request.getParameter("txtid");
                String descrip = request.getParameter("txtdesc");
                String fecha = request.getParameter("txtfech");
                String correo = request.getParameter("txtid_usuario");
                s.setId_solicitud(Integer.parseInt(id));
                s.setDescripcion(descrip);
                s.setFecha(fecha);
                s.setNombre_usuario(correo);
                sdao.agregar(s);
                request.getRequestDispatcher("ClienteExterno.jsp").forward(request, response);
                
            break;
            default:
                throw new AssertionError();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
