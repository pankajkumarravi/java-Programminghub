package com.java.programming.Collection;

/**
 * @Author pankaj
 * @create 9/13/21 8:26 AM
 */
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("java");
        queue.add("android");
        queue.add("php");
        queue.add("c++");
        queue.add("css");
        queue.add("javascript");
        queue.add("python");
        queue.add("ajax");

        queue.offer("jquery");

        //using iterator
        Iterator itr = queue.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //Retrieves, but does not remove, the head of this queue
        //throws Exception if Queue is empty
        System.out.println("head:" + queue.element());

        //Retrieves, but does not remove, the head of this queue
        System.out.println("head:" + queue.peek());

        //Retrieves and removes the head of this queue
        //throws Exception if Queue is empty
        queue.remove();
        //Retrieves and removes the head of this queue
        queue.poll();
        //remove specific value
        queue.remove("css");

        System.out.println("Queue After remove and poll operation:" + queue);

        System.out.println("Is python is present :" + queue.contains("python"));

        Object a[] = queue.toArray();
        for (Object object : a)
        {
            System.out.print(object + " ");
        }
        System.out.println();

        queue.clear();
        System.out.println(queue + " queue size :" + queue.size());
    }
}