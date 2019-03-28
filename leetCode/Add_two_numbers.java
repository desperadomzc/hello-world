/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int t = 0;
        ListNode temp = l1;
        while(true){
            l1.val = l1.val + l2.val + t;
            if(l1.val >= 10){
                l1.val -= 10;
                t = 1;
            }else{
                t = 0;
            }
            if(l1.next == null && l2.next == null){
                if(t!=0){
                    l1.next = new ListNode(t);
                }
                break;
            }else{
                if(l1.next == null) l1.next = new ListNode(0);
                if(l2.next == null) l2.next = new ListNode(0);
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return temp;
    }
}
