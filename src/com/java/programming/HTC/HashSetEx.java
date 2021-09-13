package com.java.programming.HTC;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author pankaj
 * @create 9/2/21 6:09 PM
 */
public class HashSetEx {
    public static void main(String[] args) {
        Set<Long> set = new HashSet<>();
        set.add(10l);
        set.add(20l);
        set.add(20l);
        set.add(30l);
        System.out.println(set); // ?
    }
}
