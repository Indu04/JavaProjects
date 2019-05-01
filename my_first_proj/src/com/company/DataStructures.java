package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by jpi1 on 6/9/2017.
 */
public class DataStructures {
    public static void main(String[] args){
//        char[] myArray = new char[5];
//        myArray[0] = 'a';
////        int[] testArray = {1,2,3};
////        System.out.println(Arrays.toString(testArray));
////        System.out.println(Arrays.toString(myArray));
////
//        char[][] chessBoard = new char[8][7];
//        boolean isWhite = true;
//        /* Milti dimentiona array */
//        for (int i = 0; i <chessBoard.length ; i++)
//        {   isWhite = !isWhite;
//            for (int j = 0; j < chessBoard[i].length; j++ )
//            {
//                if (isWhite) chessBoard[i][j] = 'B';
//                if (!isWhite)chessBoard[i][j] = 'W';
//                isWhite = !isWhite;
//            }
//            System.out.println(Arrays.toString(chessBoard[i])) ;
//            System.out.println(chessBoard[i]);
//        }
//
//        /*
//        ARRAY LIST
//         */
//        ArrayList<String>  myList = new ArrayList();
//
//        for(int i = 0; i < 5; i++)
//        {
//            myList.add("Hello" );
//
//        }
//        System.out.print(myList.size());
//        System.out.println(myList);

        /* MAP */

        String[] flNames = {"he", "llo", "wor", "ld"};
        String[] fname = new String[flNames.length/2];
        String[] lname = new String[flNames.length/2];

        for (int i=0; i< flNames.length; i++)
        {
            if (i%2 == 0) fname[i/2]= flNames[i];
            else lname[i/2] = flNames[i];
        }

//        System.out.println(Arrays.toString(fname));
//        System.out.println(Arrays.toString(lname));

        Map<String, String> word = new HashMap<>();

        for (int i=0; i< fname.length; i++)
        {
            word.put(fname[i], lname[i]);
        }

        System.out.println(word);
        System.out.println(word.get("he"));
    }
}
