package com.ironyard.servlet;

import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tom on 10/4/16.
 */

/**
 * Search function
 */
public class SearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //Use your service
        LineService ls = new LineService();
        //set destination
        String destination = "/index.jsp";
        //use try catch method to catch exceptions
        try
        {
         //get search text
            String searchByText = req.getParameter("searchByText");
            req.setAttribute("linelist", ls.search(searchByText));

        }
        catch (Exception error)
        {
            error.printStackTrace();
            destination = "/error.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
            dispatcher.forward(req,resp);
    }
}
