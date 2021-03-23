//Given the root node of a binary search tree, return the sum of values of all n
//odes with a value in the range [low, high]. 
//
// 
// Example 1: 
//
// 
//Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//Output: 32
// 
//
// Example 2: 
//
// 
//Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//Output: 23
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 2 * 104]. 
// 1 <= Node.val <= 105 
// 1 <= low <= high <= 105 
// All Node.val are unique. 
// Related Topics 树 深度优先搜索 递归 
// 👍 165 👎 0


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
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
//       inOrder(root,low,high);
        search(root,low,high);
       return sum;
    }
    public void inOrder(TreeNode root,int low,int high) {
        if(root == null){
            return;
        }
        inOrder(root.left,low,high);
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if(root.val > high) {
            return;
        }
        inOrder(root.right,low,high);
    }
    public void search(TreeNode root,int low,int high) {
        if(root == null) {
            return;
        }
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if(low <= root.val){
            search(root.left,low,high);
        }
        if(high >= root.val) {
            search(root.right,low,high);
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
