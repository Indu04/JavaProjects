package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jpi1 on 6/11/2017.
 */
public class Person
{
    private String fname;
    public String lname;
    public Calendar dob;

    public Person(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
        this.dob = new GregorianCalendar();
    }
    public Person(String fname, String lname, Calendar dob)
    {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    public String fullname()
    {
        return (fname + " " + lname);
    }

    public int age(Calendar today)
    {
        return today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
    }
}
