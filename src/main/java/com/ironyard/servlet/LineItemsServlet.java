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
public class LineItemsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination = "/index.jsp";
        try
        {
            LineService ls = new LineService();
            List<LineItems> allItems = ls.getAllLineService();
            req.setAttribute("myItems", allItems);

            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(destination);
            dispatcher.forward(req,resp);
        }
        catch (Exception e){
            e.printStackTrace();
            destination = "/error.jsp";
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(destination);
            dispatcher.forward(req,resp);
        }
    }
}
