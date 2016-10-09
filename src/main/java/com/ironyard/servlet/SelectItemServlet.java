package com.ironyard.servlet;

import com.ironyard.data.LineItems;
import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Tom on 10/9/16.
 */
public class SelectItemServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String destination = "/edit.jsp";

        //get the id from req

        String id = req.getParameter("id");
        Integer idParse = Integer.parseInt(id);

        LineService ls = new LineService();

        LineItems foundIt = null;

        try {
            foundIt = ls.getItemById(idParse);
        }
        catch (SQLException e){
            e.printStackTrace();
            destination = "/error.jsp";
        }
        req.setAttribute("anEdit", foundIt );

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }

}
