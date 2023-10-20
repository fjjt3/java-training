package javaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>();

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);

        System.out.println("The queue size is: " + myQueue.size());
        System.out.println("The first element is: " + myQueue.peek());

        while (!myQueue.isEmpty()){// until the queue is not empty, pop  and print elements
            System.out.println("Popped Item" + myQueue.remove());}

    }
}
