//Find the sum of all left leaves in a given binary tree. 
//
// Example:
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//There are two left leaves in the binary tree, with values 9 and 15 respectivel
//y. Return 24.
// 
// Related Topics 树 
// 👍 281 👎 0


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
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            result = root.left.val;
        } else {
            result = sumOfLeftLeaves(root.left);
        }
        return result + sumOfLeftLeaves(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
