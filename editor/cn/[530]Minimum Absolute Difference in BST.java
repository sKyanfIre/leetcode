//Given a binary search tree with non-negative values, find the minimum absolute
// difference between values of any two nodes. 
//
// Example: 
//
// 
//Input:
//
//   1
//    \
//     3
//    /
//   2
//
//Output:
//1
//
//Explanation:
//The minimum absolute difference is 1, which is the difference between 2 and 1 
//(or between 2 and 3).
// 
//
// 
//
// Note: 
//
// 
// There are at least two nodes in this BST. 
// This question is the same as 783: https://leetcode.com/problems/minimum-dista
//nce-between-bst-nodes/ 
// 
// Related Topics 树 
// 👍 236 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private Integer pre = null;
    private int minimum = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minimum;
    }
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        if(pre != null && root.val - pre < minimum) {
            minimum = root.val - pre;
        }
        pre = root.val;
        inOrder(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
