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

    public void lengthOfSignlyLinkedList(){
        ListNode temp;
        temp = head;
        int countLength = 0;
        while(temp!=null){
            countLength++;
            temp = temp.next;
        }
        System.out.println("Length of Linked List is : "+countLength);
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

    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        sll.head.next = two;
        two.next = three;
        three.next = four;
        sll.displayList();
        sll.lengthOfSignlyLinkedList();
        System.out.println("-----After insert at begining------");
        sll.insertNodeAtBegining();
        sll.displayList();
        System.out.println("-------After inserting at the end---------");
        sll.insertNodeAtEnd();
        sll.displayList();
    }
}
