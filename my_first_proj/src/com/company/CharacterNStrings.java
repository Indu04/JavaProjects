package com.company;

/**
 * Created by jpi1 on 6/8/2017.
 */

public class CharacterNStrings {
    public static void main(String[] args){
        char c1 = 72; // ASCII of H
        char c2 = 'e';
        char c3 = 'l';
        char c4 = 'l'; char c5 = 'o';

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c4);
        System.out.println(c5); //Hello

        int x = 'H' + 1;
        System.out.println(x); //73

        //String is not primitive its a class

        String s1 = "Hello";
        String s2 = "Testing";
        String s3 = s1+s2;

        System.out.println(s3.replace('e', 'p'));//HplloTpsting
        System.out.println(s1.toUpperCase());//HELLO
        System.out.println(s3);//HelloTesting


    }
}
