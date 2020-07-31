package linkedList;

public class CircularLinkedList <E>{
    Node head;

    private class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
next = null;
        }
    }
    public void add(E data){
        Node toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
toAdd.next = head;
            return;
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = toAdd;
        toAdd.next = head;
    }
    boolean isEmpty(){
        return head==null;
    }
    public void print(){
        Node temp = head;
        while(temp.next!=head){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
}
