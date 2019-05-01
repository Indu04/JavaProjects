package com.company;

/**
 * Created by jpi1 on 6/18/2017.
 */
public class MyStrings
{
    String a = "hello";

    public static void main(String[] args){
        String formatString = ">> %s <<";
        System.out.println(String.format(formatString, "abc"));
    }
}
