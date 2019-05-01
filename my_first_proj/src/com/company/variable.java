package com.company;

/**
 * Created by jpi1 on 6/8/2017.
 */
public class variable {

    public static void main(String[] args){

        int x, y;
        double z;

        x = 10;
        y = 9;
        z = 10.0;

        System.out.println(x/y); //1
        System.out.println(z/y); //1.1111111111111112
        System.out.println((float)x/y);//1.1111112

        int p = 2147483647;
        //p++;
        System.out.print(p++); // 2147483647
        System.out.print(p); //prints -2147483648

        float f = 5.5f;
        float a;
        a = 8.0f;
        a= 8f;


        float i = 3/4;//0.0
        float j = 3/4f;//0.75

        System.out.print("\n" +i);
        System.out.print(j);

    }
}
