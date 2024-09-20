 //Create a Java program that initializes a `Queue` of strings with the values {"apple", "banana", "cherry", "date"}.
    //Use an iterator to print each element in the queue.
package queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIteration {
   
    public static void main(String[] args) {
        Queue<String> values=new LinkedList<>();
        values.add("apple");
        values.add("banana");
        values.add("cherry");
        values.add("date");
        Iterator<String> iterator=values.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }
}
