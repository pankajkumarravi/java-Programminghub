package com.java.programming.array;

/**
 * @Author pankaj
 * @create 8/30/21 7:16 AM
 */
public class ArrayCopyExample {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
                't', 'e', 'd'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));
    }
}
