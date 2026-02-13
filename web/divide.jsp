<%-- 
    Document   : divide
    Created on : Feb 13, 2026, 3:28:30 PM
    Author     : rerah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Division Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            double value1=(Double)request.getAttribute("value1");
            double value2=(Double)request.getAttribute("value2");
            double quotient=(Double)request.getAttribute("quotient");
        %>
        
        <p> 
            The quotient of <b><%=value1%> </b> and <b><%=value2%> </b> is <b><%=quotient%> </b>  
            </br>
            Click <a href="menu.html"> here </a> to return to menu.
        </p>
    </body>
</html>
