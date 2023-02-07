public class SortedLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public static void main(String[] args){
        Node head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        Node head2=new Node(15);
        head2.next=new Node(28);
        head2.next.next=new Node(56);
        printlist(Merge(head1, head2));
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node Merge(Node head1, Node head2){

        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        Node head=null, tail=null;

        if(head1.data <= head2.data ){
            head=tail=head1;
            head1=head1.next;
        }
        else{
            head=tail=head2;
            head2=head2.next;
        }

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.next=head1;
                tail=head1;
                head1=head1.next;
            }
            else{
                tail.next=head2;
                tail=head2;
                head2=head2.next;
            }
        }

        if(head1 == null){
            tail.next=head2;
        }
        if(head2 == null){
            tail.next=head1;
        }
        return head;
    }

}
