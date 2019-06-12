package LinkedListPractice;

public class Main {

	public static void main(String[] args) {
		//Node head=new Node();

		myNode head=null;
		LinkedList ll=new LinkedList();
		ll.insertNode(1);
		ll.insertNode(2);
		ll.insertNode(5);
		ll.insertNode(10);
		ll.insertNode(11);
		ll.insertNode(44);
		ll.insertNode(21);
		ll.printLinkedList();
		ll.deleteAtPos(6);
		ll.printLinkedList();
	}

}
