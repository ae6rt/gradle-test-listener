package com.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestA {
    @Test
    public void testA1() {
        assertTrue(true);
    }

    @Test
    public void testA2() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void testA3() {
        assertTrue(true);
    }

/*
    @Test
    public void testA4() {
        assertTrue(false);
    }
*/
}
