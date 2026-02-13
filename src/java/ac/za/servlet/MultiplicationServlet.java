
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
import org.glassfish.soteria.servlet.RequestData;

/**
 *
 * @author rerah
 */
@WebServlet(name = "MultiplicationServlet", urlPatterns = {"/MultiplicationServlet.do"})
public class MultiplicationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int value1=Integer.parseInt(request.getParameter("value1"));
        int value2=Integer.parseInt(request.getParameter("value2"));
        
        ArithmeticManager multiply= new ArithmeticManager();
        int product = multiply.multiply(value1, value2);
        
        request.setAttribute("value1", value1);
        request.setAttribute("value2", value2);
        request.setAttribute("product", product);
        
        RequestDispatcher rd= request.getRequestDispatcher("multiply.jsp");
        rd.forward(request, response);
    }

}
