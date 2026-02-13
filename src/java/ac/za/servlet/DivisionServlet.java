/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ac.za.servlet;

import ac.za.models.ArithmeticManager;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author rerah
 */
@WebServlet(name = "DivisionServlet", urlPatterns = {"/DivisionServlet.do"})
public class DivisionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        double value1=Integer.parseInt(request.getParameter("value1"));
        double value2=Integer.parseInt(request.getParameter("value2"));
        
        ArithmeticManager divide= new ArithmeticManager();
        double quotient =divide.divide(value1, value2);
        
        request.setAttribute("value1", value1);
        request.setAttribute("value2", value2);
        request.setAttribute("quotient", quotient);
        
        RequestDispatcher rd= request.getRequestDispatcher("divide.jsp");
        rd.forward(request, response);
        
    }

  
  
}
