package queue;

public class UsingArray {
    public static void main(String agrs[]){
        MyQ q = new MyQ(5);
        q.enqueue(50);
        q.enqueue(12);
        q.enqueue(19);
        q.enqueue(5);
        q.enqueue(34);
        q.dequeue();
        q.print();

    }
}
class MyQ{
    int start;
    int size;
    int end;
    int arr[];
    MyQ(int size){
        start = 0;

        this.size = size;
        end = size-1;
        arr = new int[size];
    }
    void dequeue(){
        end = size-1;

            System.out.println("dequeue "+arr[end]);


    }
    void enqueue(int data){
        if(start==size-1){
            System.out.print("Queue is Full");
            return;
        }
        if(start <=end){
        arr[end] = data;
        end--;
        }
    }
    void print(){
        for(int i=size-1;i>=start;i--){
            System.out.println(arr[i]);
        }
    }
}