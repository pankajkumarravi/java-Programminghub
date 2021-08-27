package com.java.programming.formula;

/**
 * @Author pankaj
 * @create 8/27/21 1:13 PM
 */
import java.io.*;

class HexToDecimal
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter hex no. to convert in Decimal : ");
        String strHexNumber = br.readLine();

        /*
         * to convert hexadecimal number to decimal number use,
         * int parseInt method of Integer wrapper class.
         *
         * Pass 16 as redix second argument.
         */

        int decimalNumber = Integer.parseInt(strHexNumber, 16);
        System.out.println("Hexadecimal number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);

    }
}