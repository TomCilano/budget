package com.ironyard.servlet;

import com.ironyard.data.LineItems;
import com.ironyard.services.LineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tom on 10/8/16.
 private String description;
 private String category;
 private double budgetedAmount;
 private double totalAmount;
 private int id;
 */
public class CreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination = "/list";

        String description = req.getParameter("nDescription");
        String category = req.getParameter("nCategory");
        String budgetedAmount = req.getParameter("nBudgetedAmount");
        String totalAmount = req.getParameter("nTotalAmount");

        // set the attributes of the new object
        LineItems myLine = new LineItems();
        myLine.setDescription(description);
        myLine.setCategory(category);
        myLine.setBudgetedAmount (Double.parseDouble(budgetedAmount));
        myLine.setTotalAmount(Double.parseDouble(totalAmount));

        //use the save method written in Line service.
        try
        {
            LineService myService = new LineService();
            myService.save(myLine);
        }
        catch (Exception e){

        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);

    }


}
