/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode x = h;
        while(h.next!=null && h.next.next!=null){
            ListNode one = h.next;
            ListNode two = h.next.next;
            ListNode three = h.next.next.next;
            h.next = two;
            two.next = one;
            one.next = three;
            
            h = one;
        }
        return x.next;
    }
}
/*
ListNode x = ...//find somewhere to store the nodes you want to use, and make it clear;

head's position has changed, so remember to find a pointer, point to the pre-node of head;
*/
