package com.company;

/**
 * Created by jpi1 on 6/8/2017.
 */
public class CallByValue {
    public void display(int x){
        System.out.print(x);
        x =10;
        System.out.print(x);
    }
}
