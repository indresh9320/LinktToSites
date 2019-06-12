package LinkedListPractice;

public class LinkedList {
	myNode head;
	
	//Insert at last
	public void insertNode(int data){
		myNode n=new myNode();
		n.data=data;
		if(head==null)
		{
			head=n;
		}
		else
		{
			myNode tmp=head;
			while(tmp.next != null)
			{
				tmp=tmp.next;
			}
			tmp.next=n;
		}
	}
	
	//Print linked list
	public void printLinkedList()
	{
		myNode temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"--> ");
			temp=temp.next;
		}
		System.out.print(temp.data+" ");
		System.out.println("");
	}
	
	//Reverse a linked list
	public void reverseLinkedList()
	{
		
	}
	
	//Delete at specific position
	public void deleteAtPos(int pos)
	{
		if(head==null)
			return;
		
		myNode temp=head;
		
		if(pos==0)
		{
			head=temp.next;
		}
		
		if(pos>=1)
		{
			for(int i=0;i<pos-1 && temp!=null;i++)
			{
				temp=temp.next;
			}
			
			myNode nextTmp=temp.next.next;
			temp.next=nextTmp;
		}
	}
}
