package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(11);
        pq.add(1);
        pq.add(9);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println("poll "+pq.peek());
        System.out.println(pq.poll());


    }

}

