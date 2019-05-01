package com.company;
import java.util.*;
/**
 * Created by jpi1 on 6/19/2017.
 */
public class Exceptions {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        while(true)
        {
            try
            {
                System.out.println("ENter num:");
                System.out.println("Given input : "+ s.nextFloat());
            }
            catch (InputMismatchException i)
            {
                System.out.println("Not num");
                i.printStackTrace();
                System.out.println(i.toString());
                break;
//                s.nextLine();
            }
            catch (Exception e)
            {
                System.out.println("generic exception");
            }
            finally
            {
                s.nextLine();

            }


        }

    }
}
