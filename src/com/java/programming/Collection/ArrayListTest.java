package com.java.programming.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author pankaj
 * @create 9/13/21 7:54 AM
 */
public class ArrayListTest {

    public static void main(String[] args) {
        //creating arraylist  of type String

        ArrayList<String> al = new ArrayList<String>();
        //adding object in arraylist

        al.add("Java");
        al.add("C");
        al.add("C++");
        al.add("php");
        al.add("Java");


        System.out.print("ArrayList :" + al);
        System.out.println();

        //getting Iterator from arraylist to traverse elements
        Iterator iterator= al.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        //Using Enhance for-loop
        for (String strObj: al) {
        System.out.print(strObj+" ");
        }
        System.out.println("============================");

        //al.forEach(String->System.out.print(al));
    }
}
