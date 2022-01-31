package linkedlist;

public class LinkedListMethods {

	public static void main(String[] args) {
       LinkedList list=new LinkedList();
       list.insertAtHead(5);
       list.insertAtHead(8);
       list.insertAtHead(9);
       list.insertAtHead(30);
       list.insertAtHead(29);
       list.insertAtHead(25);
       list.insertAtHead(23);
       list.insertAtHead(22);
       System.out.println("Linked List: "+list);
       System.out.println("Length: "+list.length());
       list.deleteHeadNode();
       System.out.println("Linked List: "+list);
       System.out.println("Length: "+list.length());
	}

}
