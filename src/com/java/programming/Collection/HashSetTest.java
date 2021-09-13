package com.java.programming.Collection;

/**
 * @Author pankaj
 * @create 9/13/21 8:15 AM
 */
import java.util.HashSet;
import java.util.Iterator;

class HashSetTest
{
    public static void main(String[] args)
    {
        //Creating HashSet of type String
        HashSet<String> al = new HashSet<String>();
        al.add("Java");
        al.add("Android");
        al.add("Php");
        al.add("Ajax");
        al.add("Android");


        System.out.println(al);

        // Using Iterator
        Iterator<String> itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        // Using enhance for-loop
        for (String string : al)
        {
            System.out.print(string + " ");
        }
    }
}