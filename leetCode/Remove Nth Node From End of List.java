/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode s = temp;
        ListNode f = temp;
        for(int i=0;i<=n;i++){
                f = f.next;
            }
        while(f != null){
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return temp.next;
    }
}
