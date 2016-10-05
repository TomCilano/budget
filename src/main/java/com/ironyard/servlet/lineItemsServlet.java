package com.ironyard.servlet;

import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tom on 10/5/16.
 */
public class lineItemsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        LineService ls = new LineService();
        String destination = "/lineitems.jsp";
        try
        {
            req.setAttribute("myItems", ls.getAllLineService());
        }
        catch (Exception e){
            e.printStackTrace();
            destination = "/error.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
