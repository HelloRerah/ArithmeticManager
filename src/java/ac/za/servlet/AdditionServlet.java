
package ac.za.servlet;


import ac.za.models.ArithmeticManager;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author rerah
 */
public class AdditionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int value1= Integer.parseInt(request.getParameter("value1"));
        int value2= Integer.parseInt(request.getParameter("value2"));
        
        ArithmeticManager add= new ArithmeticManager();
        int sum= add.add(value1, value2);
        
        request.setAttribute("value1", value1);
        request.setAttribute("value2", value2);
        request.setAttribute("sum", sum);
        
        RequestDispatcher rd= request.getRequestDispatcher("add.jsp");
        rd.forward(request, response);
    }

}
