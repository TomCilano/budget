package com.ironyard.servlet;

import com.ironyard.data.LineItems;
import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tom on 10/5/16.
 */
public class ListItemsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try

        {
            LineService ls = new LineService();
            List<LineItems> myLine = ls.getAllLineService();
            req.getSession().setAttribute("myItems", myLine);


            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(req,resp);
        }
        catch (Exception e){
            e.printStackTrace();
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/error.jsp");
            dispatcher.forward(req,resp);
        }

    }
}
