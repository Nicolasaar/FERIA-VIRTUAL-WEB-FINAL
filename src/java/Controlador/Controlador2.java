/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pago;
import Modelo.PagoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Solicitud_Compra;
import Modelo.Solicitud_CompraDAO;
import Modelo.Venta_ExternaDAO;
import Modelo.Venta_Externas;
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
public class Controlador2 extends HttpServlet {
    
    ProductoDAO dao = new ProductoDAO();
    Producto p = new Producto();
    Solicitud_CompraDAO sdao = new Solicitud_CompraDAO();
    Solicitud_Compra s = new Solicitud_Compra();
    Venta_ExternaDAO vdao = new Venta_ExternaDAO();
    Venta_Externas v = new Venta_Externas();
    Pago pa = new Pago();
    PagoDAO  padao = new PagoDAO();
    

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("ClienteExterno.jsp").forward(request, response);
        }
        
        //Visulizar Compra
        if (menu.equals("Visualizar_Compra")) {
        switch (accion){
            case "Listar":
                List<Venta_Externas>datos = vdao.listar();
                request.setAttribute("datos", datos);
                
                break;
            default:
                throw new AssertionError();
        }
        request.getRequestDispatcher("VisualizarComprasExterno.jsp").forward(request, response);
        }
        
        
        //Solicitud Compra
        if (menu.equals("Solicitud_Compra")) {
            switch (accion){
                case "Listar":
                    List<Solicitud_Compra>datos = sdao.listar();
                    request.setAttribute("datos", datos);
                    request.getRequestDispatcher("SolicitudCompraExterno.jsp").forward(request, response);
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
                    request.getRequestDispatcher("SolicitudCompraExterno.jsp").forward(request, response);
                    break;
                    
                default:
                    throw new AssertionError();
            }
        request.getRequestDispatcher("SolicitudCompraExterno.jsp").forward(request, response);
        }
        //Pago Externo
        if (menu.equals("Pago")) {
            switch (accion){
                 case "Listar":
                    List<Pago>datos = padao.listar();
                    request.setAttribute("datos", datos);
                    request.getRequestDispatcher("PagoExterno.jsp").forward(request, response);
                    break;
                case "Agregar":
                    String idx = request.getParameter("txtid");
                    String iva = request.getParameter("txtiva");
                    String monto = request.getParameter("txtmonto");
                    String usuario = request.getParameter("txtid_usuario");
                    pa.setId_pago(Integer.parseInt(idx));
                    pa.setIva(Integer.parseInt(iva));
                    pa.setMonto(Integer.parseInt(monto));
                    pa.setId_usuario(Integer.parseInt(usuario));
                    padao.agregar(pa);
                    request.getRequestDispatcher("PagoExterno.jsp").forward(request, response);
                    break;
                    
                default:
                    throw new AssertionError();
            }
        request.getRequestDispatcher("PagoExterno.jsp").forward(request, response);
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

    protected void doPost2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion){
            case "Guardar2":
                 String idx = request.getParameter("txtid");
                    String iva = request.getParameter("txtiva");
                    String monto = request.getParameter("txtmonto");
                    String usuario = request.getParameter("txtid_usuario");
                    pa.setId_pago(Integer.parseInt(idx));
                    pa.setIva(Integer.parseInt(iva));
                    pa.setMonto(Integer.parseInt(monto));
                    pa.setId_usuario(Integer.parseInt(usuario));
                    padao.agregar(pa);
                    request.getRequestDispatcher("PagoExterno.jsp").forward(request, response);
                
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
