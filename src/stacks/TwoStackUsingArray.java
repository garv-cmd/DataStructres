package stacks;

public class TwoStackUsingArray {
    int arr[];
    int size;
    int top1,top2;
    TwoStackUsingArray(int size){
        this.size = size;
        top1 = -1;
        top2 = size;
        arr = new int[size];
    }
    void push1(int data){
        if(top1 < top2-1){
            top1++;
            arr[top1] = data;
        }
        else{
            System.out.println("Stack is full");
        }
    }
    void push2(int data){
        if(top1 < top2-1){
            top2--;
            arr[top2] = data;
        }
        else{
            System.out.println("Stack is full");
        }
    }
    int pop1(){
        if(top1 >= 0){
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
        }
        return 0;
    }
    int pop2(){
        if(top2 < size){
            int x = arr[top2];
            top2--;
            return x;
        } else {
            System.out.println("Stack Underflow");

        }
        return 0;
    }

    public static void main(String args[]){
        TwoStackUsingArray stack = new TwoStackUsingArray(6);
        stack.push1(1);
        stack.push2(2);
        stack.push1(3);
        stack.push2(4);
        stack.push1(5);
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
    }
}
