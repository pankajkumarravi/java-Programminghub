package com.java.programming.array;

/**
 * @Author pankaj
 * @create 8/30/21 6:56 AM
 */
public class ArrayCopy {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
                't', 'e', 'd'};
        char storeArray[] =new char[copyFrom.length];
        for (int i=0;i<copyFrom.length;i++){
            storeArray[i] = copyFrom[i];
        }
        printCharArray(storeArray);
    }
    //print logic
   public static void printCharArray(char [] array) {
       for (int i = 0; i < array.length; i++)
           System.out.println(array[i]);
     }
}
