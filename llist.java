import java.util.*;

public class llist {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
     void removeDup( ){
        Node curr=head;

        while(curr!=null && curr.next!=null){

            if(curr.data == curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
    }
     void printlist( ) {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        llist ll=new llist();
        ll.push(10);
        ll.push(20);
        ll.push(20);
        ll.push(30);
        ll.push(30);
        ll.push(10);
        ll.printlist();
        ll.removeDup();
        ll.printlist();

    }

    public void push(int i) {
        Node newNode=new Node(i);
        newNode.next=head;
        head=newNode;
    }

}
