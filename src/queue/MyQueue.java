package queue;

public class MyQueue<E> {
    Node<E> head,rear;
     class Node <E>{
        E data;
        Node next;
        Node(E data){
            this.data = data;
            next = null;
        }
    }
    public void enqueue(E e){

        Node<E> toAdd = new Node<E>(e);
        if(head==null){
            head=rear=toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public E dequeue(){
         if(head==null){
             return null;
         }

         Node<E>temp = head;
         head = head.next;
        if(head==null){
            rear=null;
        }
         return temp.data;

    }
    public void print(){
         Node<E> temp = head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp = temp.next;
         }
System.out.println();
    }
}
