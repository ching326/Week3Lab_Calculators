<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2022, 2:33:32 AM
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
        <h1>Arithmetic Calculator</h1>

        <form method = "post" action = "arithmetic"> 

            First: <input type="text" name ="firstNum"><br>
            Second: <input type="text" name ="secondNum"><br>
            <input type="Submit" name="operator" value ="+">  
            <input type="Submit" name="operator" value ="-">  
            <input type="Submit" name="operator" value ="*">  
            <input type="Submit" name="operator" value ="%">  


            <%-- submit to the URL arithmetic, which is mapped to the ArithmeticCalculatorServlet, then ArithmeticCalculatorServlet will run the doPost  --%>
        </form>

        <p>Result: ${answer}</p>
        <p><a href="age">Age Calculator</a></p>



    </body>
</html>