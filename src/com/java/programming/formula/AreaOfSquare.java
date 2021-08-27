package com.java.programming.formula;

/**
 * @Author pankaj
 * @create 8/27/21 2:04 PM
 */
import java.util.*;

class AreaOfSquare
{
    public static void main(String args[])
    {
        int side, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of the sides of square");
        side = sc.nextInt();

        area = side * side;

        System.out.println("Area of Square : " + area);
    }
}
