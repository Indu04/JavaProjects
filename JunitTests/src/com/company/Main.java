package com.company;

import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main
{

    public static void main(String[] args)
    {
//        org.junit.runner.JUnitCore.main("com.company.SimpleTest");
//        JUnitCore.runClasses(SimpleTest.class);
//        JUnitCore.main("com.company.TestPrimer");
//        Result result = JUnitCore.runClasses(TestPrimer.class);
//        for (Failure failure : result.getFailures())
//        {
//            System.out.println(failure.toString());
//        }
//
//        System.out.println(result.wasSuccessful());
//        CodeTest ct = new CodeTest();
//        ct.my_func(2,3);
//        ct.my_func(3,2);
        JUnitCore.main("com.company.SimpleTest_2");
    }

}

