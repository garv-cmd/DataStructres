package tree;

public class MainClass {
    public static void main(String args[]){
        MyTree mt = new MyTree();
        mt.insert(4);
        mt.insert(6);
        mt.insert(20);
        mt.insert(170);
        mt.insert(15);
        mt.insert(1);
        boolean check = mt.search(0);
        mt.inorder();
        System.out.println(check);
    }
}
