package com.company;

/**
 * Created by jpi1 on 6/9/2017.
 */
public class looptest {
    public static void main(String[] args){

        String a = "hello";
        a.concat("b");
        System.out.println(a.concat("b"));

        int i = 7;

        do
        {
            System.out.println(i);
            i--;
        }while (i >0 );
    }
}
