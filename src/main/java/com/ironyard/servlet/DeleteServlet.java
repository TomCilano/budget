package com.ironyard.servlet;

import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Tom on 10/8/16.
 */
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String destination = "/lineitems";

        String id = req.getParameter("id");
        // grab the movie by its id
        int idDel = Integer.parseInt(id);

        LineService ls = new LineService();

        try {
            ls.delete(idDel);
        }
        catch (SQLException e){
            e.printStackTrace();
            destination = "error.jsp";
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
