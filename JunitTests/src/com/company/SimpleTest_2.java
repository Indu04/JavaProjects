package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jpi1 on 6/12/2017.
 */
public class SimpleTest_2 {
    @Before
    public void beforeTest(){ System.out.println(" SimpleTest_2 Before test");}

    @After
    public void afterTest(){ System.out.println("SimpleTest_2 After test");}

    @Test
    public void testEmptyCollection() {
        System.out.println("SimpleTest_2 testEmptyCollection test");
        Collection collection = new ArrayList();
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testEquals() {
        System.out.println("SimpleTest_2 testEquals test");
        int i = 3;
        int y =3;
        assertEquals(i,y);}

    @Test
    public void testCodetest(){
        System.out.println("My Test");
        CodeTest ct = new CodeTest();
        ct.my_func(2,3);
//        ct.my_func(3,2);

    }
}
