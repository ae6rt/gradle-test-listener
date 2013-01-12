package com.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestNGA {

    @Test
    public void testA1() {
        assertTrue(true);
    }

    @Test
    public void testA2() {
        assertTrue(true);
    }

/*
    @Test
    public void testA3() {
        assertTrue(false);
    }
*/


    @Test(enabled = false)
    public void testA4() {
        assertTrue(true);
    }

}
