package linkedlist;
import java.util.Scanner;
public class LinkedList {
	Node head;
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public LinkedList(){
		this.head = null;
	}
	
	public void buildList(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
//		System.out.println("This is list node data "+newNode.data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void diplayList() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println("Null");
		}
	}
	
	public void getLengthOfLinkedList() {
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		System.out.println("Length of linked list is : "+count);
	}
	
	public static void main(String[] args) {
		System.out.println("------------------Welcome to Linked List-----------------");
		Scanner sc = new Scanner(System.in);
		LinkedList  singlyLinkedList = new LinkedList();
		while(true){
			System.out.println("-->Operations\n0) To display list\n1) To add new node\n2)Get length of linked list\n999) To exit");
			int choice = sc.nextInt();
			switch(choice){
			case 0:
				singlyLinkedList.diplayList();
				break;
			case 1:
				System.out.println("Enter value");
				int nodeData = sc.nextInt();
				singlyLinkedList.buildList(nodeData);
				break;
			case 2:
				singlyLinkedList.getLengthOfLinkedList();
				break;
			}
			if(choice == 999) {
				break;
			}
		}
		System.out.println("------------------Linked List Program ended-----------------");
		
	}

}
