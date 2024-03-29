public class childSumProperty {
    public static Boolean isCSum(Node root){
        if(root == null) return true;
        if(root.left == null && root.right == null){
            return true;
        }
        int sum=0;
        if(root.left != null) sum+=root.left.data;
        if(root.right != null) sum+=root.right.data;

        return (root.data==sum && isCSum(root.left) && isCSum(root.right));

    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left=new Node(3);
        root.left.right = new Node(5);
        System.out.print(isCSum(root));
    }
}
