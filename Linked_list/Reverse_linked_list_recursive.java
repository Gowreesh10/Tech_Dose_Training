package Linked_list;

public class Reverse_linked_list_recursive {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode newNode = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newNode;
    }
}
