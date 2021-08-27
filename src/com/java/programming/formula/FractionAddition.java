package com.java.programming.formula;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 8/27/21 1:08 PM
 */

class FractionAddition
{
    public static void main(String args[])
    {
        float a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = scanner.nextFloat();
        System.out.print("Enter b : ");
        b = scanner.nextFloat();
        System.out.print("Enter c : ");
        c = scanner.nextFloat();
        System.out.print("Enter d : ");
        d = scanner.nextFloat();

        // fraction addition formula ((a*d)+(b*c))/(b*d)
        System.out.print("Fraction Addition : [( " + a + " * " + d + " )+( " + b + " * " + c + " ) / ( " + b + " * " + d + " )] = " + (((a * d) + (b * c)) / (b * d)));
    }
}