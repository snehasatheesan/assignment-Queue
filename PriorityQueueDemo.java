//Write a Java program that creates a `PriorityQueue` of integers.
    //Add the numbers 5, 1, 3, 2, and 4 to the queue.
    //Print the head of the queue using the `peek` method, then remove the head and print the entire queue to show the new order.
package queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        sc.add(5);
        sc.add(1);
        sc.add(3);
        sc.add(2);
        sc.add(4);

        System.out.println("Head of the Queue: "+sc.peek());
        sc.poll();
        System.out.println("Queue after head removing: "+sc);
    }
}
