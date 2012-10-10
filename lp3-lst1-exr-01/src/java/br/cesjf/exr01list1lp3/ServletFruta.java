/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.exr01list1lp3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme
 */
@WebServlet(name = "Fruta", urlPatterns = {"/fruta.jsp"})
public class ServletFruta extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */

            List<String> lista = new ArrayList<String>();
            lista.add("Pera");
            lista.add("Uva");
            lista.add("Maca");
            lista.add("Banana");
            lista.add("Kiwi");
            lista.add("Fruta do Conde");
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<style>");
                    out.println(".dest {");
                            out.println("color: red;");
                            out.println("text-decoration:underline;");
                          out.println("}");

                    out.println(".dest1 {");
                            out.println("color: red;");
                          out.println("}");
                          
                    out.println(".dest2 {");
                            out.println("text-decoration:underline;");
                          out.println("}");
                          
                out.println("</style>");
                out.println("<title></title>");
                out.println("<body>");
                    out.println("<div>");
                        out.println("<ul>");
                            for (int i = 0; i < lista.size(); i++) {
                                String a = "a";
                                if (lista.get(i).length() % 2 == 0) {
                                    if (lista.get(i).endsWith(a)) {
                                        out.println("<li class='dest'>" + lista.get(i) + "</li>");
                                        }   
                                    else {
                                            out.println("<li class='dest1'>" + lista.get(i) + "</li>");
                                         }
                                    }
                                else {
                                        out.println("<li class='dest2'>" + lista.get(i) + "</li>");
                                     }
                            }
                        out.println("</ul>");
                    out.println("</div>");
                out.println("</body>");
                out.println("</head>");
            
            out.println("</html>");

        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
