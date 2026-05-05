package PracticeQuestions.GeeksforGeeks.LinkedList;

public class ReverseLinkedList {

    void reverselinkedlist(LinkedListNode head) {
        LinkedListNode rev = null;
        LinkedListNode curr = head;
        LinkedListNode fwd = curr.next;

        while (curr != null) {
            curr.next = rev;
            rev = curr;
            curr = fwd;
            if (fwd != null) {
                fwd = fwd.next;
            }
        }
        head=rev;
        LinkedListNode.printLinkedList(head);
    }


    public static void main() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(2);
        head.next = node1;
        LinkedListNode node2 = new LinkedListNode(3);
        node1.next = node2;
        LinkedListNode node3 = new LinkedListNode(4);
        node2.next = node3;
        ReverseLinkedList rev = new ReverseLinkedList();
        rev.reverselinkedlist(head);
    }


}
