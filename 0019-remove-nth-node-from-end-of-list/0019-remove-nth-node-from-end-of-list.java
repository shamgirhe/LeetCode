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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
         if(head==null){
            return null;
        }
        if(head.next ==null && n==1){
            return null;
        }
        int count =0;
        while(temp!=null){
            count++;
            temp= temp.next;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        temp = head;
      //  System.out.println(count);
         //   System.out.println(count-n-1);
         for(int i=1; i<count-n;i++){
              temp=temp.next;
               
         }
          temp.next=temp.next.next;
        return head;
    }
}