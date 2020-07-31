package linkedList;

public class DoublyRun {
    public static void main(String args[]){
       DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();
       dl.insertAtHead(5);
        dl.insertAtHead(2);
        dl.insertAtHead(7);

        dl.add(99);
        dl.add(100);
        dl.add(78);

        dl.insertAtIndex(1,567);

      //  dl.remove(3);


        dl.print();


    }
}
