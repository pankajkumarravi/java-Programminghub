package com.java.programming.HTC;

/**
 * @Author pankaj
 * @create 9/2/21 6:07 PM
 */
public class StrIO {
    public static void main(String[] args) {

        String s1 = new String("Pankaj");
        String s2 = new String("Pankaj");

        System.out.println(s1==s2); // true or false

        System.out.println(s1.equals(s2)); // true or false
        System.out.println("====================");
        String s3 = "Pankaj";
        String s4 = s3;
        String s5 = s3;

        System.out.println(s4==s5); // true or false

        System.out.println(s4.equals(s5)); // true or false

    }
}
