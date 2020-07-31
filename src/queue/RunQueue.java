package queue;

import java.util.LinkedList;
import java.util.Queue;
//queue using linkedlist
//.remove gives exception, .poll gives null
//add , offer
//element , peek
//push rear -> enqueue
//pop head -> dequeue

public class RunQueue {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.element());


        //My Queue

        MyQueue<Integer> tryQueue = new MyQueue<>();
        tryQueue.enqueue(10);
        tryQueue.enqueue(20);
        tryQueue.enqueue(30);
        tryQueue.print();
        tryQueue.dequeue();
        tryQueue.print();
    }
}
