package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectliquorservlet",
        urlPatterns = "/SelectLiquor"
)
public class ServletCalculator extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String liquorType = req.getParameter("ordervalue");

            Calculator liquorService = new Calculator();
            String l = liquorType ;

            req.setAttribute("ordervalue", l);
            RequestDispatcher view = req.getRequestDispatcher("result.jsp");
            view.forward(req, resp);

        }
    }

