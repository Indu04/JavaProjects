package com.company;

import java.util.Arrays;

/**
 * Created by jpi1 on 6/10/2017.
 */
public class MethodTest {
    public static void main(String[] args){
        int x = 10;
        increment(x);
        System.out.println(x);

        int[] y ={1,2,3};
        increment(y);
        System.out.println(Arrays.toString(y));
    }
    public static void increment(int x){ x+=10;}

    public static void increment(int[] x) {
        for  (int i = 0; i< x.length ; i++)
        {
            x[i] +=10;
        }
    }
}
