//Given the root of a Binary Search Tree (BST), return the minimum difference be
//tween the values of any two different nodes in the tree. 
//
// Note: This question is the same as 530: https://leetcode.com/problems/minimum
//-absolute-difference-in-bst/ 
//
// 
// Example 1: 
//
// 
//Input: root = [4,2,6,1,3]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: root = [1,0,48,null,null,12,49]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 100]. 
// 0 <= Node.val <= 105 
// 
// Related Topics 树 深度优先搜索 递归 
// 👍 114 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int prev = -1;
    public int minDis = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return minDis;
    }
    public void inOrder(TreeNode root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        if(prev != -1 && root.val - prev < minDis){
               minDis = root.val - prev;
        }
        prev = root.val;
        inOrder(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
