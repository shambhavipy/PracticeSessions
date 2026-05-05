package PracticeQuestions.GeeksforGeeks.LinkedList;

public class LinkedListNode {
    int value;
    LinkedListNode next;

    LinkedListNode(int i) {
        this.value = i;
        this.next = null;
    }

    static  void printLinkedList(LinkedListNode head) {
        LinkedListNode temp = head;
        while(temp!=null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
