package by.ruslan.radevich.webcalculator.web.servlet;

import by.ruslan.radevich.webcalculator.entity.User;
import by.ruslan.radevich.webcalculator.service.UserService;
import jdk.jshell.EvalException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional<User> byUsername = userService.getByUsername(username);
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(password)) {
                req.getSession().setAttribute("currentUser", user);
                resp.sendRedirect("/");
                return;
            } else {
                req.setAttribute("message", "Wrong password!!");
            }
        } else {
            req.setAttribute("message", "User not found!");
        }
        getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }
}
