/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayList(){
        ListNode temp ; 
        temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public int lengthOfSignlyLinkedList(){
        ListNode temp;
        temp = head;
        int countLength = 0;
        while(temp!=null){
            countLength++;
            temp = temp.next;
        }
        return countLength;
        // System.out.println("Length of Linked List is : "+countLength);
    }

    public void insertNodeAtBegining(){
        ListNode first = new ListNode(99);
        first.next = head;
        head = first;
    }

    public void insertNodeAtEnd(){
        ListNode temp ;
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new ListNode(6969);
    }

    public void insertAtGivenPosition(int lengthOfLinkedList){
        ListNode temp;
        temp = head;
        int position = 3;
        int indexing = 1;
        if(position>lengthOfLinkedList){
            System.out.println("Position is greater than length of string");
        }else{
            while (indexing!=position-1) {
                temp = temp.next;
                indexing++;
            }
            ListNode relate;
            ListNode givenPos = new ListNode(116);
            relate = temp.next;
            temp.next = givenPos;
            givenPos.next = relate;
            
        }
        
    }

    public ListNode deleteFirstNode(){
        if(head == null){
            return null;
        }
        ListNode temp;
        temp = head;
        head=head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLastNode(int length){
        if(head == null){
            return null;
        }
        ListNode temp;
        ListNode deletedNode = null;
        temp = head;
        System.out.println("Length in fucntion is "+length);
        if(length>2){
            while (temp.next.next != null) {
                temp = temp.next; 
            }
            deletedNode = temp.next;
            temp.next = null;
        }
        return deletedNode;
    }

    public static void main(String[] args){
        System.out.println("---------------------------Welcome to Linked List operations---------------------------");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        sll.head.next = two;
        two.next = three;
        three.next = four;
        sll.displayList();
        System.out.println("-----After insert at begining------");
        sll.insertNodeAtBegining();
        sll.displayList();
        System.out.println("-------After inserting at the end---------");
        sll.insertNodeAtEnd();
        sll.displayList();
        System.out.println("Insert at a given position");
        int lengthOfLinkedList = sll.lengthOfSignlyLinkedList();
        sll.insertAtGivenPosition(lengthOfLinkedList);
        sll.displayList();
        ListNode returnedValue = sll.deleteFirstNode();
        System.out.println("\nNode with value "+returnedValue.data+" is deleted");
        sll.displayList();
        lengthOfLinkedList = sll.lengthOfSignlyLinkedList();
        ListNode deletedLastNode =  sll.deleteLastNode(lengthOfLinkedList);
        System.out.println("Last node removed is"+deletedLastNode.data);
        sll.displayList();
    }
}
