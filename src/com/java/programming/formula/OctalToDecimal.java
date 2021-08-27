package com.java.programming.formula;

/**
 * @Author pankaj
 * @create 8/27/21 1:14 PM
 */
import java.io.*;

class OctalToDecimal
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Octal no. to convert in Decimal : ");
        String number = br.readLine();

        /*
          to convert Octal number to decimal number use,
          int parseInt method of Integer wrapper class.

          Pass 8 as redix second argument.
         */

        int decimalNumber = Integer.parseInt(number, 8);
        System.out.println("Octal number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);

    }
}