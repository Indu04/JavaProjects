package com.company;

import java.util.Scanner;

/**
 * Created by jpi1 on 6/9/2017.
 */
public class SwitchTest {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter input");
        int input = x.nextInt();

        switch(input)
        {
            case 1: case 5:case 6: System.out.print("one");
                break;

            case 2: System.out.print("two");
            break;
            default: System.out.print("de");


        }
    }
}
