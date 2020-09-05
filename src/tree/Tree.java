package tree;

import java.util.Scanner;

public class Tree {
    static Scanner sc = null;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(root.data);
        InOrder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);
    }
    static Node createTree(){
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();
        return root;
    }
    static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    static void PreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);

        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;

    }
}