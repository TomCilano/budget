package com.ironyard.services;

import com.ironyard.data.LineItems;
import com.ironyard.data.Total;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/29/16.
 * CREATE TABLE lineitem
 (
 lin_description VARCHAR(155),
 lin_category VARCHAR(155),
 lin_budgetedamount NUMERIC,
 lin_actualamount NUMERIC,
 lin_id INTEGER PRIMARY KEY NOT NULL
 );
 */

public class LineService {
    public List<LineItems> getAllLineService() throws SQLException {
        LineItems found = null;
        List<LineItems> allOfThem = new ArrayList<LineItems>();
        DbService myDba = new DbService();
        Connection conn =  myDba.getConnection();
        PreparedStatement stmt = conn.prepareCall("SELECT * FROM budget.lineitem");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            found = new LineItems();
            found.setDescription(rs.getString("lin_description"));
            found.setCategory(rs.getString("lin_category"));
            found.setBudgetedAmount(rs.getDouble("lin_budgetedamount"));
            found.setTotalAmount(rs.getDouble("lin_actualamount"));
            found.setId(rs.getInt("lin_id"));
            allOfThem.add(found);
        }
        return allOfThem;
    }
    public List<Total> getTotals() throws SQLException{
        Total found = null;
        List<Total> allTotals = new ArrayList<Total>();
        DbService myDba = new DbService();
        Connection conn =  myDba.getConnection();
        PreparedStatement stmt = conn.prepareCall("SELECT lin_category, sum(lin_budgetedamount) AS totalBudget, sum(lin_budgetedamount) as actualtotal from budget.lineitem group by lin_category");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            found = new Total();
            found.setCategory(rs.getString("lin_category"));
            found.setBudgetTotal(rs.getDouble("totalBudget"));
            found.setActualTotal(rs.getDouble("actualtotal"));
            allTotals.add(found);
        }
            return allTotals;
    }
}