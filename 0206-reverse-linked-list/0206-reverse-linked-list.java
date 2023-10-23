/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode oldhead = head;
        head=null;
        while(oldhead!=null){
            ListNode temp = oldhead;
            oldhead = oldhead.next;
            temp.next=head;
            head=temp;
        }
        return head;
    }
}