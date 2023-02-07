import java.util.*;

class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next =null;
    }
}
class LinkedList {
    Node head;
    public void insertBegin(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        }
}
public class Mmainn{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertBegin(10);
        list.insertBegin(20);
        list.insertBegin(30);
        list.insertBegin(40);
        list.insertBegin(50);
        System.out.println("current list is");
        list.printList();
    }

}




