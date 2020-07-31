package linkedList;

public class RunLinkedList {
    public static void main(String args[]){
        MyLInkedList<Integer> ml = new MyLInkedList<>();
        ml.add(10);
        ml.add(20);
        ml.add(30);
        ml.add(40);
        ml.add(50);
        ml.add(60);
        ml.remove(1);
        ml.set(3,99);
         ml.insertBeg(9999);
        ml.print();

        ml.reverse();
    System.out.println();


        CircularLinkedList cl = new CircularLinkedList();
        cl.add(10);
        cl.add(20);
        cl.add(30);
        cl.add(90);
        cl.add(1);
        cl.add(22);
        cl.print();

    }
}
