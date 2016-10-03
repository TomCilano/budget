package com.ironyard.servlets;

import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tom on 9/30/16.
 */
public class LineServlet extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            /// create a new instance of the service to be used
            LineService thisLineService = new LineService();
            // put into request
            req.getSession().setAttribute("selectedLine", thisLineService.getAllLineService());

            // forward to create page
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(req, resp);
        }
        //in case of exceptions throw to error page.
        catch(Throwable e){
            e.printStackTrace();
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/error.jsp");
            dispatcher.forward(req, resp);
        }
    }
}