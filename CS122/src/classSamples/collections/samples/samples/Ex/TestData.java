package classSamples.collections.samples.Ex;//********************************************************************
//  TestData.java       Author: Lewis/Loftus
//
//  Demonstrates I/O exceptions and the use of a character file
//  output stream.
//********************************************************************

import java.util.Random;
import java.io.*;

public class TestData {
    public static int method(int i) {
        System.out.println("value of i is:"+i);
//		 non-recursive or terminating part  == base case
        if(i==1){
            return 1;
        }
        //recursive or non terminating part
        else {
            return method(i-1);
        }
    }

    public static int factorial(int num) {
        if(num==1)
            return  1;
        else
            return num * factorial(num-1);
    }


    public static int fiveN(int n){
        if(n==1)
            return 5;
        else
            return  5 + fiveN(n-1);
    }

    public static void main(String[] args) {
//		method(10);
//        System.out.println(factorial(5));
        fiveN(10);
    }
}
