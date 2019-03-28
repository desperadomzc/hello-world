//Ugly solution(400ms):
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode pre = head;
        while(true){
            //break point
            int count = 0;
            for(ListNode l: lists){
                if(l == null){
                    count++;
                }
            }
            if(count == lists.length) break;
            
            //find the min value
            int min = 10000;
            int index = 0;
            for(int i = 0; i<lists.length ; i++){
                if(lists[i] == null){
                    continue;
                }else{
                    if(lists[i].val < min){
                        min = lists[i].val;
                        index = i;
                    }
                }
            }
            pre.next = new ListNode(min);
            pre = pre.next;
            lists[index] = lists[index].next;
        }
        return head.next;
    }
}

//Smart solution(recursive,merge sort):
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        return mergeTwoLists(mergeKLists(Arrays.copyOfRange(lists,0,lists.length/2)),mergeKLists(Arrays.copyOfRange(lists,lists.length/2,lists.length)));
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
