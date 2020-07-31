package tree;

public class MyTree {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    MyTree(){
        root = null;
    }

    public void insert(int data){
        Node toIns = new Node(data);
        if(root == null){
            root = toIns;
            return;
        }
        Node currentNode = root;
        while(true){
            if(toIns.data < currentNode.data){
                if(currentNode.left==null){
                    currentNode.left = toIns;
                    break;
                }
                currentNode = currentNode.left;
            }
            else{
                if(currentNode.right==null){
                    currentNode.right = toIns;
                    break;
                }
                currentNode = currentNode.right;
            }
        }
    }
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);

            System.out.println(root.data);
            inorderRec(root.right);

        }
    }

    public boolean search(int data){
        if(root == null){
            return false;
        }
        Node curr = root;
        while(curr!=null){
            if(data < curr.data){
                curr = curr.left;
            }
            else if(data > curr.data){
                curr = curr.right;
            }
            else if(data == curr.data){
                return true;
            }
        }
        return false;
    }
}
