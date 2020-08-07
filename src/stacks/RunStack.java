package stacks;

public class RunStack <E>{
    public static void main(String args[]) throws Exception{
        MyStack<String> ms= new MyStack<>();
       ms.push("Hello");
        ms.push("Hey");
        ms.push("Hii");
        String ret = ms.pop();
        String top = ms.peek();
        System.out.println(ret +" " + top);
    }
}
