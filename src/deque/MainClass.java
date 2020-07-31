package deque;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String args[]){
        ArrayDeque<String> ad  = new ArrayDeque<>();
        //stack,queue,linkedlist,collections all methods are available
        ad.push("Garv");
        ad.push("Wadhwa");
        ad.push("Chitkara");
        String popped = ad.pop();
        System.out.println(popped);
        System.out.println(ad);
    }
}
