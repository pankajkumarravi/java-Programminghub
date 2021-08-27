package com.java.programming.formula;

/**
 * @Author pankaj
 * @create 8/27/21 9:26 AM
 */
class CalculateCircleAreaExample
{

    public static void main(String[] args)
    {

        int radius = 3;
        System.out.println("The radius of the circle is " + radius);

        /*
         * Area of a circle is pi * r * r where r is a radius of a circle.
         */

        // NOTE : use Math.PI constant to get value of pi
        double area = Math.PI * radius * radius;

        System.out.println("Area of a circle is " + area);
    }
}
