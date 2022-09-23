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
public class AgeCalculatorServlet extends HttpServlet {

    //AgeCalculatorServlet runs doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //This line is to forward the request response objects to agecalculator.jsp
        //this JSP then received those objects, got converted to an HTML file and then sent back response to the browser.
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    // doPost happens after user submit the form by POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Retrive the parameter from the form
        String currentAgeText = request.getParameter("currentAge");

        if (currentAgeText.equals("")) {
            request.setAttribute("message", "You must give your current age");

            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }

        if (!currentAgeText.matches("[0-9]+")) {
            request.setAttribute("message", "You must enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }

        int currentAge = Integer.parseInt(currentAgeText);
        int nextAge = currentAge + 1;

        //Set attributes which will be forwarded to jsp
        request.setAttribute("nextAge", nextAge);

        request.setAttribute("message", "Your age next birthday will be " + nextAge);

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

}
