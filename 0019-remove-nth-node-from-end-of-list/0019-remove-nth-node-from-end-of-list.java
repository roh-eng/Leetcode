class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Step 1: Count length
        int length = 0;
        ListNode temp = head;
        
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        if (length == n) {
            return head.next;
        }
        
        temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}