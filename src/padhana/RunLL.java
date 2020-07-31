package padhana;

public class RunLL {
    public static void main(String args[])throws Exception{
        MYLL<String> ll = new MYLL<>();
        ll.add("garv");
        ll.add("wadhwa");
        ll.add("haha");
        ll.add("lol");
        ll.print();
        ll.size();
        ll.remove("wa");
        ll.print();
    }
}
