package deque;

public class RunDeque {
    public static void main(String args[]){
        MyDeque<String> md = new MyDeque<>();
        md.addToHead("Garv");
        md.addToHead("Wadhwa");
        md.addToHead("HAHA");
       System.out.println(md.removeLast());
        System.out.println(md.removeLast());
        System.out.println(md.removeLast());
        System.out.println(md.removeLast());

    }
}
