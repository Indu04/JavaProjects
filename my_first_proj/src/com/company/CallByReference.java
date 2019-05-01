package com.company;

/**
 * Created by jpi1 on 6/8/2017.
 */
public class CallByReference {
    public void display(StringBuffer x)
    {
        x.append("_test");
        System.out.print(x);

    }

}
