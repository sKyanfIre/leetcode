//Given a singly linked list, determine if it is a palindrome. 
//
// Example 1: 
//
// 
//Input: 1->2
//Output: false 
//
// Example 2: 
//
// 
//Input: 1->2->2->1
//Output: true 
//
// Follow up: 
//Could you do it in O(n) time and O(1) space? 
// Related Topics 链表 双指针 
// 👍 791 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode next;
    public boolean isPalindrome(ListNode head) {
        // 1.额外数组,双指针遍历
//        ListNode next = head;
//        List<Integer> cache = new ArrayList<>();
//        while(next != null) {
//            cache.add(next.val);
//            next = next.next;
//        }
//        int left = 0;
//        int right = cache.size() - 1;
//        while(left <= right) {
//            if(!cache.get(left).equals(cache.get(right)))
//                return false;
//            left++;
//            right--;
//        }
//        return true;
        // 2.递归
//        next = head;
//        return isPalindrome2(head);
        // 3.快慢指针查找中间位置，反转后半部分
        if (head == null || head.next == null) {
            return true;
        }
        ListNode quick = head;
        ListNode slow = head;
        ListNode mid = head;
        while (quick.next != null && quick.next.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        // 反转后半部分
        mid = reverseLinkedList(slow.next);
        while (mid != null) {
            if (head.val != (mid.val)) {
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }
    public ListNode reverseLinkedList(ListNode start) {
        ListNode current = start;
        ListNode pre = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
    public boolean isPalindrome2(ListNode head) {
        if(head == null) {
           return true;
        }
        boolean res = isPalindrome2(head.next) && head.val == next.val;
        next = next.next;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
