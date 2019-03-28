/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 ==null && l2==null){
            return null;
        }
        
        ListNode pre = new ListNode(0);
        ListNode head = pre;
        while(l1 != null || l2 != null){
            if(l1 !=null && l2!=null){
                if(l1.val <= l2.val){
                    pre.next = new ListNode(l1.val);
                    pre = pre.next;
                    l1 = l1.next;
                }else{
                    pre.next = new ListNode(l2.val);
                    pre = pre.next;
                    l2 = l2.next;
                }
            }else{
                if(l1 == null){
                    pre.next = new ListNode(l2.val);
                    pre = pre.next;
                    l2 = l2.next;
                }else{
                    pre.next = new ListNode(l1.val);
                    pre = pre.next;
                    l1 = l1.next;
                }
            }
        }
        return head.next;
    }
}
