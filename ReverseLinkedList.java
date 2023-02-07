public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printlist(head);
        head=reverse(head);
        printlist(head);
    }

    static Node reverse(Node head){
        Node curr=head, prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
}
