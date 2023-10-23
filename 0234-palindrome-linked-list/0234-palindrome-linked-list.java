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
    public boolean isPalindrome(ListNode head) {
      Stack<Integer> s = new Stack<>();
      ListNode temp = head;
      while(temp != null){
          s.push(temp.val);
          temp = temp.next;
      }
      temp = head;
      while(temp != null){
         if(temp.val != s.pop()) return false; 
          temp = temp.next;
      }
    return true;
    //     StringBuilder sb = new StringBuilder();
    //     while(head !=null){
    //         sb.append(head.val);
    //         head=head.next;
    //     }
    //     return sb.toString().equals(sb.reverse().toString());
    }
}