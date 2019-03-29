/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode t = head;
        ListNode s = head.next;
        
        while(t != s){
            if(t.next == null) return false;
            t = t.next;
            if(s.next == null || s.next.next == null) return false;
            s = s.next.next;
        }
        
        return s==t;
    }
}

/*
SET ONE POINTER GO FIRST AND TWO STEPS ONCE;
SET ANOTHER POINTER GO SECOND AND ONE STEP PER TIME, THEY NEVER MEET;
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        while(head!=null){
            if(nodes.contains(head)) return true;
            else nodes.add(head);
            head = head.next;
        }
        return false;
    }
}
/*
USE HASHSET NO REPETITION
*/
