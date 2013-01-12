package com.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestB {
    @Test
    public void testB1() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void testB2() {
        assertTrue(true);
    }
}
