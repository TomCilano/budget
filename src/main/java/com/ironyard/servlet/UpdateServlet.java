package com.ironyard.servlet;

import com.ironyard.data.LineItems;
import com.ironyard.services.LineService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tom on 10/9/16.
 */
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination =  "/lineitems";


        String description = req.getParameter("nDescription");
        String category = req.getParameter("nCategory");
        String budgetedAmount = req.getParameter("nBudgetedAmount");
        String totalAmount = req.getParameter("nTotalAmount");
        String id = req.getParameter("id");


        Double budA =  Double.parseDouble(budgetedAmount);
        Double totA = Double.parseDouble(totalAmount);
        int idA = Integer.parseInt(id);

        LineItems updateLine = new LineItems();

        updateLine.setDescription();

        LineService ls = new LineService();

        try {
            ls.update();
        }
    }
}
