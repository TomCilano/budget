
package test;

import com.ironyard.services.DbService;
import org.junit.Assert;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;


public class DbServiceTest {
    @org.junit.Test
    public void getConnection() throws Exception {
        DbService dbService = new DbService();
        Connection conn = dbService.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM budget.lineitem");

        boolean foundSomething = false;
        while(rs.next()){
            foundSomething = true;
            System.out.println(rs.getString("lin_category"));
        }
        Assert.assertTrue("Db connection not working",foundSomething);

    }

}