package linkedList;

public class DoublyLinkedList <E>{
    Node head;
    class Node{
        E data;
        Node next,prev;
        Node(E data){
            this.data = data;

            next = null;
            prev = null;
        }
    }
    public void insertAtHead(E data){
        Node toAdd = new Node(data);
        if(head== null){
            head = toAdd;
            return;
        }
        toAdd.next = head;
        head.prev = toAdd;
        head = toAdd;
    }

    public void add(E data){
        Node toAdd = new Node(data);
        if(head == null){
            head = toAdd;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = toAdd;
        toAdd.prev = curr;

    }

    public void remove(int ind){
        if(head == null){
            return;
        }
        int i =1;
        Node curr = head;
        while(i++!=ind){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.next.prev = curr.next;
    }

    void insertAtIndex(int ind,E data){
        Node toAdd = new Node(data);
        if(head==null && ind==0){
            head = toAdd;
            return;
        }
        if(ind==0){
            insertAtHead(data);
            return;
        }
        Node curr = head;
        int i =1;
        while(i++!=ind){
            curr = curr.next;
        }
        toAdd.next = curr.next.next;
        toAdd.prev = curr.next;
        curr.next.next.prev = toAdd;
       curr.next.next = toAdd;

    }

    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"  ");
            curr = curr.next;
        }
    }
}
