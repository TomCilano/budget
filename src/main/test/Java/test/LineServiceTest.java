package test;

import com.ironyard.services.LineService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tom on 9/30/16.
 */
public class LineServiceTest {
    @Test
    public void getAllLineService() throws Exception {

        LineService testLine = new LineService();
        Assert.assertNotNull(testLine.getAllLineService());
    }


}