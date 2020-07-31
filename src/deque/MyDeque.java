package deque;

public class MyDeque<E> {
    Node<E> head;
    Node<E> tail;

    public void addToHead(E data){
        Node<E> toAdd= new Node(data);
        if(head==null){
            head = tail = toAdd;
            return;
        }
        head.next = toAdd;
        head.prev = head;
        head = toAdd;

    }

    public E removeLast(){
        if(head==null){
            return null;
        }


        Node<E> toRemove = tail;
        tail = tail.next;
        if(tail==null){
            head = null;
        }
        return toRemove.data;
    }


    public class Node<E>{
        E data;
        Node<E> next,prev;
        Node(E data){
            this.data = data;
            this.prev = this.next = null;
        }
    }
}
