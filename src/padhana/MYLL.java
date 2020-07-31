package padhana;

public class MYLL <E> {
    Node <E> head;
    public void add(E data){
        Node <E> toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }
        Node <E> temp = head;
       while(temp.next!=null){
       temp = temp.next;
       }
       temp.next = toAdd;
    }
    void remove(E data){

        Node <E> temp = head;
        Node<E> torem = new Node(data);
        if(head.data == torem.data){
            head = head.next;
            return;
        }
        if(head.next.data == torem.data){
            head.next = head.next.next;
            return;
        }
        while(temp!=null){
            if(temp.data ==torem.data){
                temp = temp.next;
            }
            temp = temp.next;
        }
    }
    public void size(){
        Node<E> nd = head;
        int count = 1;
        while(nd.next!=null){
            count++;
            nd = nd.next;
        }
        System.out.println(count);
    }

    public boolean isEmpty(){
        return head==null;
    }

    void print() throws Exception{
        if (isEmpty()){
            throw new Exception("List is Empty");
        }
        Node<E> temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    class Node <E>{
        E data;
        Node next;
        Node(E data){
            this.data =data;
            next = null;
        }

    }
}
