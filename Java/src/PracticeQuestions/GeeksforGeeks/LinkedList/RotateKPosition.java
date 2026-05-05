package PracticeQuestions.GeeksforGeeks.LinkedList;

public class RotateKPosition {

    public static void rotateLLKposition(LinkedListNode head, int k) {
        int kthPos = k % (length(head));
        int temp = 0;

        LinkedListNode curr = head;
        int len = 1;

        while (curr.next != null) {
            curr = curr.next;
            len += 1;
        }
        k %= len;
        curr.next = head;
        curr = head;
        for (int i = 1; i < k; i++)
            curr = curr.next;
        head = curr.next;
        curr.next = null;



        /*for(int i = 0;i<kthPos; ++i)

    {
        LinkedListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        curr = curr.next;
        head = head.next;
        curr.next = null;
    }*/


}

public static int length(LinkedListNode head) {
    int count = 0;
    int length = 0;
    LinkedListNode curr = head.next;
    while (curr.next != null) {
        count++;
        curr = curr.next;
    }
    return count;
}


    public static void main () {
        LinkedListNode head = new LinkedListNode(10);
        LinkedListNode node1 = new LinkedListNode(20);
        node1 = head.next;
        LinkedListNode node22 = new LinkedListNode(35);
        node22 = head.next.next;
        LinkedListNode node3 = new LinkedListNode(40);
        node3 = head.next.next.next;
        LinkedListNode node4 = new LinkedListNode(50);
        node4.next = null;
        //rotateLLKposition(head, 4);
    }
}




