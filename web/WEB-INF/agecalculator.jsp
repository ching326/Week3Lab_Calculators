<%-- 
    Document   : agecalculator
    Created on : 23-Sep-2022, 2:27:10 AM
    Author     : keith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        
        <form method = "post" action = "age"> 
           
            Enter your age: <input type="text" name ="currentAge"><br>
            <input type="Submit" value ="Age next birthday">  
            <%-- submit to the URL age, which is mapped to the AgeCalculatorServlet, then AgeCalculatorServlet will run the doPost  --%>
        </form>
        
        <p>${message}</p>
        
        
    </body>
</html>
