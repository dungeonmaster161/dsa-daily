// class SinglyLinkedList{
//     private ListNode head;
//     private static class ListNode{
//         private int data;
//         private ListNode next;
        
//         public ListNode(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void display(){
//         ListNode current = head;
//         while (current!=null) {
//             System.out.print(current.data+"->");
//             current = current.next;
//         }
//        System.out.print("NULL");
//     }

//     public int lengthOfSinglyLinkedList(){
//         ListNode current  = head;
//         int length = 0;
//         while (current!=null) {
//             length++;
//             current = current.next;
//         }
//         return length;
//     }

//     public void insetNodeAtBegining(int data){
//         ListNode temp = new ListNode(data);
//         temp.next = head;
//         head = temp;
//     }

//     public void insetNodeAtEnd(int data){
//         ListNode temp = new ListNode(data);
//         ListNode current = head;
//         while (current.next!=null) {
//             current = current.next;
//         }
//         current.next = temp;
//     }
//     public static void main(String[] args) {
//         SinglyLinkedList sll = new SinglyLinkedList();
//         sll.head = new ListNode(1);
//         ListNode  one = new ListNode(2);
//         ListNode two = new ListNode(3);
//         ListNode three = new ListNode(4);
//         sll.head.next = one;
//         one.next = two;
//         two.next = three;
//         sll.display();
//         System.out.println("Length of singly Linked List is "+sll.lengthOfSinglyLinkedList());
//         sll.insetNodeAtBegining(5);
//         sll.insetNodeAtBegining(6);
//         sll.insetNodeAtEnd(99);
//         sll.display();
//     }
// }

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

    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
        // ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
       sll.head.next = two;
       two.next = three;
       three.next = four;
        sll.displayList();
    }
}
