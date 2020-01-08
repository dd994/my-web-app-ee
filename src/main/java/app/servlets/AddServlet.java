package app.servlets;

import app.dao.UserDAO;
import app.entities.UserTest;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String password = req.getParameter("pass");
//        UserTest userTest = new UserTest(name, password);
//        Model model = Model.getInstance();
//        model.add(userTest);
//        req.setAttribute("userName", name);
//        doGet(req, resp);
        String firstname = req.getParameter("firstname");
        String secondname = req.getParameter("secondname");
        String mail = req.getParameter("mail");
        String age = req.getParameter("age");
        UserDAO.saveUser(firstname,secondname,mail,parseInt(age));
        doGet(req, resp);
    }

}
