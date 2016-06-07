package servlet;

import dao.dao;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class login extends HttpServlet {

    String log, pass;


    @Override
    public void init(ServletConfig config) {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //request.getRequestDispatcher("login.jsp").forward(request, response);

        log = request.getParameter("log");
        pass = request.getParameter("pass");
        dao.USERNAME = log;
        dao.PASSWORD = pass;
        if(dao.USERNAME!=null){
            response.sendRedirect("/");
        }else {request.getRequestDispatcher("autor.jsp").forward(request, response);}
    }
}




