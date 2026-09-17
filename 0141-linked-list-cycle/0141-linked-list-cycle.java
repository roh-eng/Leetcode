/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> mmp=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(!mmp.add(temp)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}