package com.ironyard.services;

import com.ironyard.data.LineItems;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Tom on 10/4/16.
 */
public class LineServiceTest {
    @Test
    public void getAllLineService() throws Exception {

    }

    @Test
    public void getTotals() throws Exception {

    }

    @Test
    public void search() throws Exception {
        List<LineItems> items = null;
        LineService ls = new LineService();
        items = ls.search("f");
        Assert.assertTrue(items.size()>0);
    }

}