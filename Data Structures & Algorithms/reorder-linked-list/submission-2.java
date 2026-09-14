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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
       while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        ListNode prev = slow.next = null;
        while(mid!=null){
            ListNode temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }

        ListNode first = head;
        mid = prev;
        while(mid!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = mid.next;
            first.next = mid;
            mid.next = temp1;
            first = temp1;
            mid = temp2; 
        }
    }
}
