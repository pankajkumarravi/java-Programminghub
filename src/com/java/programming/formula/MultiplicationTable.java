package com.java.programming.formula;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 8/27/21 10:46 AM
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number to display its multiplication table!! ");
        int number=scanner.nextInt();
       System.out.println("Multiplication table of "+number+" is ::::: ");
        /*for (int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }*/
         int i=1;
        while (i<=10){
            System.out.println(number*i);
            i++;
        }
    }
}
