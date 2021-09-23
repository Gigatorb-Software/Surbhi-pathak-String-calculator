package com.gigatorb.cal;

import org.junit.Test;

import static com.gigatorb.cal.cal.add;
import static org.junit.Assert.assertEquals;

public class CalTest {

    @Test
    public  void TestString(){
        assertEquals(3,add("1,2"));
    }

}


