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
        ListNode slow = head;
        ListNode fast = head;
        //Find middle
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the second half
        ListNode secondhalf = reverse(slow);
        ListNode firsthalf = head;
        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val){
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
        
        

        
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}