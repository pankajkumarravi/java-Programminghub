package com.java.programming.formula;

/**
 * @Author pankaj
 * @create 8/27/21 10:38 AM
 */
import java.util.*;

class FahrenheitToCelsius
{

    public static void main(String[] args)
    {

        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        temperature = in.nextInt();

        temperature = (temperature - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + temperature);
    }
}
