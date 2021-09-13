package com.java.programming.Collection;

/**
 * @Author pankaj
 * @create 9/13/21 8:23 AM
 */
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
    public static void main(String[] args)
    {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("java");
        ts.add("php");
        ts.add("android");
        ts.add("css");

        System.out.println(ts);

        //using Iterator
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        //Using enhanced for-loop
        for (String string : ts)
        {
            System.out.print(string + " ");
        }
    }
}