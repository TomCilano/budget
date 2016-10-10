package test;

import com.ironyard.data.LineItems;
import com.ironyard.services.LineService;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tom on 10/8/16.
 */
public class CreateTest {

    @Test
    public void createBudget() throws Exception {
        LineService ls = new LineService();
        LineItems li = new LineItems();
        li.setCategory("Food");
        li.setDescription("Beer");
        li.setBudgetedAmount(100);

        li.setTotalAmount(300);

        try {
            ls.save(li);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<LineItems> found = ls.search("Food");
        assertNotNull(found);
        assertTrue(found.size() == 1);
        LineItems foundBudget = found.get(0);
        assertEquals(foundBudget.getCategory(), "Food");
        assertEquals(foundBudget.getDescription(), "Beer");
        assertEquals(foundBudget.getBudgetedAmount(), 100, 1);
        assertEquals(foundBudget.getTotalAmount(), 300, 1);
        assertTrue(foundBudget.getId() > 0);
    }
}
