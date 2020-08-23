package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("4");
        pq.add("C++");
        pq.add("WELCOME");
        pq.add("C++");
        while(!pq.isEmpty())
        System.out.println(pq.remove());



    }

}

