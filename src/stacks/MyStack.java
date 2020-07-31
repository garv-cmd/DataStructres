package stacks;
//stack using linkedlist
public class MyStack<E> {
    Node head;
    public class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
            next = null;
        }
    }
    public void push(E data){
        Node toInsert = new Node(data);
        Node ch = head;
        if(isEmpty()){
            head = toInsert;
            return;
        }
        while(ch.next!=null){
            ch = ch.next;

        }
        ch.next = toInsert;
    }
    boolean isEmpty(){
        return head==null;
    }

    public E pop() throws Exception{
        Node ch = head;
        if(isEmpty()){
            throw new Exception("Stack is Empty");

        }
        while(ch.next.next!=null){
            ch = ch.next;
        }
        Node popped = ch.next;
        ch.next = null;
        return  popped.data;

    }
    public E peek() throws Exception{
        Node ch = head;
        if(isEmpty()){
            throw new Exception("Stack is Empty");

        }

        while(ch.next!=null){
            ch = ch.next;
        }
        return ch.data;
    }


}
