package stacks;

public class RunStack <E>{
    public static void main(String args[]) throws Exception{
        MyStack<String> ms= new MyStack<>();
//        ms.push("garv");
//        ms.push("is");
//        ms.push("nonu");
        String ret = ms.pop();
        String top = ms.peek();
        System.out.println(ret +" " + top);
    }
}
