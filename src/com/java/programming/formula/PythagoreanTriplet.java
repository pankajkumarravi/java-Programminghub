package com.java.programming.formula;

/**
 * @Author pankaj
 * @create 8/27/21 2:00 PM
 */
/*
Pythagorean Triplet:
c*c = a*a + b*b
*/

class PythagoreanTriplet
{
    public static void main(String s[]) throws Exception
    {
        System.out.println("Pythagorean Triplet: ");
        for (int a = 1; a <= 50; a++)
        {
            for (int b = 1; b <= 50; b++)
            {
                int csquared = a * a + b * b;
                double croot = Math.sqrt(csquared);

                if (croot == Math.ceil(croot))
                {
                    System.out.println(a + " " + b + " " + (int) croot);
                }
            }
        }
    }
}