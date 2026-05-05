package PracticeQuestions.GeeksforGeeks.LinkedList;

public class FindElement {
    boolean findElement(int i, LinkedListNode head) {
        LinkedListNode tmp = head;

        while(tmp!=null) {
            if(tmp.value == i) {
                return true;
            }

            tmp = tmp.next;
        }

        return false;
    }

    static void main() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        head.next = node2;
        LinkedListNode node3 = new LinkedListNode(3);
        node2.next = node3;
        LinkedListNode node4 = new LinkedListNode(4);
        node3.next = node4;

        FindElement obj = new FindElement();
        System.out.println(obj.findElement(6, head));
    }
}
