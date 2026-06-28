import java.util.*
    class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // find length
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len; // important
        if (k == 0) return head;

        // make circular
        tail.next = head;

        // find new tail (len - k - 1 steps)
        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }

        // break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
