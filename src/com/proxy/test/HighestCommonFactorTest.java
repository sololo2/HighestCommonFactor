package com.proxy.test;

import org.junit.Test;
import com.proxy.main.HighestCommonFactor;
import static org.junit.Assert.*;



public class HighestCommonFactorTest {

    HighestCommonFactor highestCommonFactor = new HighestCommonFactor();

    @Test
    public void getHighestCommonFactorServiceTest(){
        int[] numbers = {5,10,15,20};
        assertEquals(5,highestCommonFactor.getHighestCommonFactor(numbers));
    }

    @Test
    public void getHighestCommonFactorServiceTestIs1(){
        int[] numbers = {3,31,2,18};
        assertEquals(1,highestCommonFactor.getHighestCommonFactor(numbers));
    }
}