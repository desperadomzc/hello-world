/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(k==0) return head;
        ListNode copy = head;
        ListNode slow = head;
        int len = 0;
        while(copy != null) {
            len++;
            copy = copy.next;
        }
        copy = head;
        k = k%len;
        for(int i=0;i<k;i++){
            copy = copy.next;
        }
        while(copy.next != null){
            slow = slow.next;
            copy = copy.next;
        }
        if(slow.next!= null){
            copy.next = head;
            head = slow.next;
            slow.next = null;
        }

        return head;
    }
}
