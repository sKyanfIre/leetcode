//Given a binary tree, check whether it is a mirror of itself (ie, symmetric aro
//und its center). 
//
// For example, this binary tree [1,2,2,3,4,4,3] is symmetric: 
//
// 
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
// 
//
// 
//
// But the following [1,2,2,null,3,null,3] is not: 
//
// 
//    1
//   / \
//  2   2
//   \   \
//   3    3
// 
//
// 
//
// Follow up: Solve it both recursively and iteratively. 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 1224 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


import java.util.LinkedList;

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
    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> leftQueue = new LinkedList<TreeNode>();
//        leftQueue.offer(root);
//        leftQueue.offer(root);
//        while(!leftQueue.isEmpty()) {
//            TreeNode left = leftQueue.poll();
//            TreeNode right = leftQueue.poll();
//            if(left == null && right == null) {
//                continue;
//            }
//            if((left == null || right == null) ||( left.val != right.val)) {
//                return false;
//            }
//            leftQueue.offer(left.left);
//            leftQueue.offer(right.right);
//            leftQueue.offer(left.right);
//            leftQueue.offer(right.left);
//        }
//        return true;

        return check(root,root);

    }
    public boolean check(TreeNode left,TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(right == null || left == null) {
            return false;
        }

        return left.val == right.val && check(left.left,right.right) && check(left.right,right.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
