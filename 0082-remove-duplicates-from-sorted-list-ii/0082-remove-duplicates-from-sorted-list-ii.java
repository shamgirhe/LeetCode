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
    public ListNode deleteDuplicates(ListNode head) {
       Map<Integer, Integer> map = new LinkedHashMap<>();
        while(head !=null){
            map.put(head.val,map.getOrDefault(head.val,0)+1);
            head=head.next;
        }
        ListNode newhead = new ListNode(-1);
        ListNode temp = newhead;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue()==1){
                ListNode newnode = new ListNode(m.getKey());
                temp.next = newnode;
                temp=newnode;
            }
        }
        head = newhead.next;
            return head;
    }
}