<%-- 
    Document   : index
    Created on : 22/05/2019, 07:43:53 AM
    Author     : dario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>wea kisawea</h1>
        
        <form action="logged" method="POST">
            <div>
                <input type="text" name="user" placeholder="Tu usuario" id="user_input">
            </div>
            
            <div>
                <input type="password" name="pass" placeholder="Tu contraseña" id="pass_input">
            </div>
            
            <div>
                <button type="submit">login</button>
            </div>
            
        </form>
    </body>
</html>
