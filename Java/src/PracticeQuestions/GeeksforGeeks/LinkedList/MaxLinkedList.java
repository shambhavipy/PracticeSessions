package PracticeQuestions.GeeksforGeeks.LinkedList;

public class MaxLinkedList {

    int maxLinkedList(LinkedListNode head){
        LinkedListNode temp = head;
        LinkedListNode max = temp;

        while(temp!=null){
            if(temp.value>max.value){
                max= temp;
            }

            temp=temp.next;
        }

        return max.value;
    }

    static void main() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(2);
        head.next = node1;
        LinkedListNode node2 = new LinkedListNode(3);
        node1.next=node2;
        LinkedListNode node3 = new LinkedListNode(4);
        node2.next=node3;
        MaxLinkedList max = new MaxLinkedList();
        System.out.println(max.maxLinkedList(head));
    }
}
