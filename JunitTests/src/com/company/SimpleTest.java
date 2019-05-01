package com.company;

/**
 * Created by jpi1 on 6/12/2017.
 */
import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class SimpleTest {

    @Before
    public void beforeTest(){ System.out.println("Before test");}

    @After
    public void afterTest(){ System.out.println("After test");}

    @Test
    public void testEmptyCollection() {
        System.out.println("testEmptyCollection test");
        Collection collection = new ArrayList();
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testEquals() {
        System.out.println("testEquals test");
        int i = 3;
        int y =7;
        assertEquals(i,y);

    }

//    public static junit.framework.Test suite() {
//        return new junit.framework.JUnit4TestAdapter(SimpleTest.class);
//    }

//    public static void main(String args[]) {
//        org.junit.runner.JUnitCore.main("com.company.SimpleTest");
//    }
}
