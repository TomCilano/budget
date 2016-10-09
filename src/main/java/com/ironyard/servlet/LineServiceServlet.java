package com.ironyard.servlet;

import com.ironyard.data.LineItems;
import com.ironyard.data.Total;
import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 10/3/16.
 */
public class LineServiceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String destination = "/index.jsp";
        try{
        LineService ls = new LineService();
        List<LineItems> allLine = ls.getAllLineService();


            double one = 0.0;
            double two = 0.0;
            double three = 0.0;

            req.setAttribute("lineitems", ls.getAllLineService());
            req.getSession().setAttribute("total", ls.getTotals());
            for(LineItems x: allLine){
                one = one + x.getBudgetedAmount();
                two = two + x.getTotalAmount();
                three = two - one;
            }
            req.getSession().setAttribute("totalbudget", one);
            req.getSession().setAttribute("totalamount", two);
            req.getSession().setAttribute("difference", three);

            LineService nLs = new LineService();
            req.setAttribute("linetotal", nLs.getTotals());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            destination = "/error.jsp";
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);

    }

}
