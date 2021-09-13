package com.java.programming.Collection;

/**
 * @Author pankaj
 * @create 9/13/21 8:21 AM
 */
import java.util.HashSet;

class HashSetBasic
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("Android");
        hs.add("Php");
        hs.add("Ajax");

        System.out.println(hs);

        hs.add("Python");
        System.out.println(hs);

        // Can't add duplicate
        System.out.println("Is Java added :" + hs.add("Java"));

        // remove from HashSet
        hs.remove("Php");

        // Size of HashSet
        System.out.print("Size of ArrayList after removing Php :" + hs.size());
        System.out.println();

        System.out.println("Is java is in list :" + hs.contains("Java"));

        // HashSet to array
        Object[] a = hs.toArray();

        System.out.print("Array :");
        for (Object object : a)
        {
            System.out.print(object + " ");
        }
        System.out.println();

        //clear whole HashSet
        hs.clear();
        System.out.print(hs + " " + "Is HashSet empty after clear :" + hs.isEmpty());

    }
}
