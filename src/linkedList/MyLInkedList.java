package linkedList;

public class MyLInkedList<E> {
    Node head;

    public void add(E data){
        Node myNode = new Node(data);
        if(isEmpty()){
            head = myNode;
            return;
        }
        Node ch = head;
        while(ch.next!=null){
            ch = ch.next;

        }
        ch.next = myNode;

    }
    public void insertBeg(E data){
        Node toAdd = new Node(data);
        if(head==null){
            head = toAdd;
            return;
        }
        toAdd.next = head;
        head = toAdd;
    }
    //reverse linked list
    public void reverse(){
        Node prev = null;
        Node current = head;
        if(head==null || head.next==null){
            return ;
        }
        while(current!=null){
            head = current.next;
            current.next = prev;
            prev = current;
            current = head;
        }

       while(prev!=null){
           System.out.print(prev.data+" ");
           prev=prev.next;
       }
    }
    public boolean isEmpty(){
        return head==null;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        Node ch = head;

        while(ch!=null){
            System.out.println(ch.data+" ");
            ch = ch.next;
        }

    }

    public void remove(int pos){
        Node ch = head;
        int i=1;
        while(i!=pos){
            ch = ch.next;
            i++;
        }
        ch.next = ch.next.next;
    }

    public void set(int pos,E data){
        Node ch = head;
        Node toChange = new Node(data);
        int i=1;
        while(i!=pos){
            ch = ch.next;
            i++;
        }
        toChange.next = ch.next.next;
        ch.next = toChange;

    }

    public class Node{
        E data;
        Node next;
        Node( E  data){
            this.data = data;
            next = null;
        }
    }
}
