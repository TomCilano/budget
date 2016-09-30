package com.ironyard.services;

import com.ironyard.data.LineItems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/29/16.
 */
public class LineService {
    public List<LineItems> getAllLineService() throws SQLException {
        LineItems found = null;
        List<LineItems> allOfThem = new ArrayList<LineItems>();
        DbService myDba = new DbService();
        Connection conn = (Connection) myDba.getConnection();
        PreparedStatement stmt = conn.prepareCall("SELECT * FROM LineItems");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            found = new LineItems();
            found.setCategory(rs.getString("Category"));
            allOfThem.add(found);
        }
        return allOfThem;
    }
}