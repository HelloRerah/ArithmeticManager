<%-- 
    Document   : multiply
    Created on : Feb 13, 2026, 3:06:18 PM
    Author     : rerah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiplication Outcome Page</title>
    </head>
    <body>
        <h1>OutCome</h1>
        <% 
            Integer value1=(Integer)request.getAttribute("value1");
            Integer value2=(Integer)request.getAttribute("value2");
            int product=(Integer)request.getAttribute("product");
        %>
        <p> 
            The Product of <b><%=value1%> </b> and <b><%=value2%> </b> is <b><%=product%> </b>  
            </br>
            Click <a href="menu.html"> here </a> to return to menu.
        </p>
    </body>
</html>
