//Reverse a singly linked list. 
//
// Example: 
//
// 
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
// 
//
// Follow up: 
//
// A linked list can be reversed either iteratively or recursively. Could you im
//plement both? 
// Related Topics 链表 
// 👍 1388 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 1.迭代
//        ListNode current = head;
//        ListNode prev = null;
//        ListNode next = null;
//        while(current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        return prev;
        // 2.递归
        if(head == null || head.next == null) {
            return head;
        }
        ListNode current = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
