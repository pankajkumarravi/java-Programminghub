package com.java.programming.Collection;

/**
 * @Author pankaj
 * @create 9/13/21 8:25 AM
 */
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest
{
    public static void main(String[] args)
    {
        //TreeMap is sorted
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();

        hm.put(100, "java");
        hm.put(102, "android");
        hm.put(101, "php");
        hm.put(103, "c++");
        hm.put(104, "html");

        System.out.println(hm);
    }
}