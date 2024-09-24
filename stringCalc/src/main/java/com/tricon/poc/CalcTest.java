package com.tricon.poc;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
public class CalcTest {
    @BeforeClass
    public static void show(){
        System.out.println("start");
    }
    @Test
    public void empty(){
        assertEquals(0,StringCalc.add(""));
    }
    @Test
    public void singleNumber(){
        assertEquals(8,StringCalc.add("8"));
    }
    @Test
    public void numbe(){
        assertEquals(9,StringCalc.add("7,2"));
    }
    @Test
    public void numbera(){
       assertEquals(8,StringCalc.add("5,1\n2"));
    }
    @Test(expected = RuntimeException.class)
    public void testnegnum() {
        StringCalc.add("-3,6");
    }
    @Test
    @Ignore
    public void ignorenum(){
        assertEquals(3,StringCalc.add("10000,2000,3"));
    }
    @AfterClass()
    public static void end(){
        System.out.println("the end");
    }
}