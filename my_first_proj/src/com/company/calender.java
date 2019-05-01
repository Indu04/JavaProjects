package com.company;
import java.util.*;

/**
 * Created by jpi1 on 6/18/2017.
 */
public class calender {
    public static void main(String[]args)
    {
//        Calendar my_cal = new GregorianCalendar();
        Calendar my_cal = Calendar.getInstance();
        System.out.println(my_cal.get(Calendar.YEAR));
        System.out.println(my_cal.get(Calendar.MONTH)+1);

    }
}
