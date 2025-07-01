/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author anujy
 */
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            double result = 0;
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String op = request.getParameter("operator");
            switch(op) {
                case "+" : {
                    result = num1 + num2;
                    break;
                }
                case "-" : {
                    result = num1 - num2;
                    break;
                }
                case "*" : {
                    result = num1 * num2;
                    break;
                }
                case "/" : {
                    if(num2 == 0){
                        result = 0;
                    }else{
                        result = num1 / num2;
                    }                   
                    break;
                }                
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <meta charset=\"UTF-8\">");
            out.println("    <title>Simple Calculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <h1>Simple Calculator</h1>");
            out.println("    <form action= \"MyServlet\">");
            out.println("       <div>");
            out.println("           <label for=\" num1\">Enter Number 1: </label>");
            out.println("           <input type=\" number\" name = \"num1\" id = \"num1\">");
            out.println("       </div>");
            out.println("       ");
            out.println("       <div>");
            out.println("           <label for = \"num2\">Enter Number 2 :</label>");
            out.println("           <input type = \"number\" name = \"num2\" id = \"num2\">");
            out.println("       </div>");
            out.println("       ");
            out.println("       <div>");
            out.println("           <p>Select Operator</p>");
            out.println("           <label for = \"operator1\">+</label>");            
            out.println("           <input type=\"radio\" name = \"operator\" id=\"operator1\" value= \"+\">");
            out.println("           <label for = \"operator2\">-</label>");            
            out.println("           <input type=\"radio\" name = \"operator\" id=\"operator2\" value= \"-\">");
            out.println("           <label for = \"operator3\">*</label>");            
            out.println("           <input type=\"radio\" name = \"operator\" id=\"operator3\" value= \"*\">");
            out.println("           <label for = \"operator4\">/</label>");            
            out.println("           <input type=\"radio\" name = \"operator\" id=\"operator4\" value= \"/\">");
            out.println("       </div>");
            out.println("       ");
            out.println("       <input type= \"submit\" name = \"submit\">");
            out.println("<div> Result is : ");
            out.println(result);
            out.println("</div>");
            out.println("    </form>");
            out.println("</body>");
            out.println("</html>");
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
