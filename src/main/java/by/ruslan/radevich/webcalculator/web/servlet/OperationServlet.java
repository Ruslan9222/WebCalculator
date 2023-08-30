package by.ruslan.radevich.webcalculator.web.servlet;

import by.ruslan.radevich.webcalculator.entity.Operation;
import by.ruslan.radevich.webcalculator.entity.User;
import by.ruslan.radevich.webcalculator.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(value = "/calculator", name = "OperationServlet")
public class OperationServlet extends HttpServlet {
    private final OperationService operationService = OperationService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/calculator.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type");

        User currentUser = (User) req.getSession().getAttribute("currentUser");

        Optional<Operation> calculate = operationService.calculate(num1, num2, type, currentUser);
        if (calculate.isPresent()) {
            Operation operation = calculate.get();
            req.setAttribute("result", operation);
        } else {
            req.setAttribute("message", "Type not found!");
        }
        getServletContext().getRequestDispatcher("/pages/calculator.jsp").forward(req, resp);
    }
}
