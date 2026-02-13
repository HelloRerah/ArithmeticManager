<%-- 
    Document   : subtract
    Created on : Feb 13, 2026, 3:28:43 PM
    Author     : rerah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subtraction Outcome</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            Integer value1=(Integer)request.getAttribute("value1");
            Integer value2=(Integer)request.getAttribute("value2");
            int difference=(Integer)request.getAttribute("difference");
        %>
        <p> 
            The difference of <b><%=value1%> </b> and <b><%=value2%> </b> is <b><%=difference%> </b>  
            </br>
            Click <a href="menu.html"> here </a> to return to menu.
        </p>
    </body>
</html>
