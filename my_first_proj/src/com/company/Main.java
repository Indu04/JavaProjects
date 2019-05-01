package com.company;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
//        System.out.print("In main \n");
//        CallByValue cr = new CallByValue();
//        int y = 10;
//        cr.display(y);
//        System.out.print(y);
//
//        CallByReference cbr = new CallByReference();
//        StringBuffer s = new StringBuffer("Hello");
//        cbr.display(s);
//        System.out.print(s);

//        Person indu = new Person("indu", "shree", new GregorianCalendar(1988, 10,4));
        Person indu = new Person("indu", "shree");
//        indu.fname = "indu";
//        indu.lname = "shree";
//        indu.dob = new GregorianCalendar(1988,10,4);

        System.out.println(indu.fullname());
        System.out.println(indu.age(new GregorianCalendar(2017,6, 11)));

    }
}
