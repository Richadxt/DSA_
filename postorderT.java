import java.util.*;

class node{
    int key;
    node left;
    node right;
    node(int k){
        key = k;
        left=right=null;
    }
}

public class postorderT {
    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.left.left = new node(40);
        root.left.right = new node(60);
        postTraversal(root);

    }
   public static void postTraversal(node root){
        if(root!=null){
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.key + " ");

        }
   }
}
