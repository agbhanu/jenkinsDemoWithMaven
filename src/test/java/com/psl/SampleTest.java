package com.psl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SampleTest {
    @Test
    public void sumOfTwoNumTest(){
        assertTrue(new Sample().sumOfTwoNum(2,4)==6);
    }
}
