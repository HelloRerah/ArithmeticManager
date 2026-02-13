

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Outcome Page</title>
    </head>
    <body>
        <h1>Outome</h1>
        <% 
            Integer value1 = (Integer)request.getAttribute("value1");
            Integer value2 = (Integer)request.getAttribute("value2");
            Integer sum = (Integer)request.getAttribute("sum");
        %>
        <p> 
            The Sum of <b><%=value1%> </b> and <b><%=value2%> </b> is <b><%=sum%> </b>  
            </br>
            Click <a href="menu.html"> here </a> to return to menu.
        </p>
    </body>
</html>
