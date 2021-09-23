package com.gigatorb.cal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalTest {
    private Cal cal = new Cal();
    @Test
    public void testEmptyString() throws Exception{
        assertEquals(0,cal.add(""));
    }
    @Test
    public void testSingleString() throws Exception{
        assertEquals(1,cal.add("1"));
    }

    @Test
    public  void testString() throws Exception{
        assertEquals(6,cal.add("1,2,3"));
    }

    @Test
    public void testDelimiters() throws Exception{
        assertEquals(6,cal.add("1;2;3"));
    }

    @Test
    public void testNegativeNumbers() throws Exception{
        assertEquals(6,cal.add("1,2,-3,-5"));
    }


}


