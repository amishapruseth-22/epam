package interview;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CustomLinkedList {
     private Node head;

     public void insertAtBeginning(int data){
         Node newNode=new Node(data);
         if(head==null){
             head=newNode;

         }
         newNode.next=head;
         head=newNode;
     }

     public void insertAtEnd(int data) {
         Node newNode = new Node(data);
         if (head == null) {
              head = newNode;
              head.next = null;
         } else {
             Node current = head;
             while (current.next != null) {
                 current = current.next;
             }
                 current.next = newNode;

         }
     }
     public void deleteAtBeginning(int data){
         if (head == null) {
             System.out.println("List is empty");
             return;
         }
         else{
             int number=head.data;
             head = head.next;
         }
     }
     public void deleteAtEnd(int data){
         if(head==null){
             System.out.println("List is empty");
         }
         if (head.next==null){
             head=null;
         }
         else {
             Node current =head;
             while(current.next!=null && current.next.next!=null){
                 current=current.next;
             }
             int number = current.data;
             current.next=null;

         }
     }

     public void printList() {
         Node current = head;
         while (current != null) {
             System.out.print(current.data + "-> ");
             current=current.next;
         }
     }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.printList();
        System.out.println();// Output: 10-> 20-> 30
        list.deleteAtEnd(30);
        list.printList(); // Output: 10-> 20
    }
}
