package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author keith
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Default value for answer
        request.setAttribute("answer", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Retrive the parameter from the form
        String fisrtNumString = request.getParameter("firstNum");
        String secondNumString = request.getParameter("secondNum");
        String answer = "---";

        //Validation
        if (fisrtNumString.equals("") || secondNumString.equals("")
                || !fisrtNumString.matches("[0-9]+") || !secondNumString.matches("[0-9]+")) {
            request.setAttribute("answer", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }

        int fisrtNum = Integer.parseInt(fisrtNumString);
        int secondNum = Integer.parseInt(secondNumString);
        String operator = request.getParameter("operator");

        //Operation
        switch (operator) {
            case "+":
                answer = String.valueOf(fisrtNum + secondNum);
                request.setAttribute("answer", answer);
                break;
            case "-":
                answer = String.valueOf(fisrtNum - secondNum);
                request.setAttribute("answer", answer);
                break;
            case "*":
                answer = String.valueOf(fisrtNum * secondNum);
                request.setAttribute("answer", answer);
                break;
            case "%":
                answer = String.valueOf(fisrtNum % secondNum);
                request.setAttribute("answer", answer);
                break;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
