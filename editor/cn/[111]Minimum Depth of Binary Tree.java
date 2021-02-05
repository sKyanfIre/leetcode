//Given a binary tree, find its minimum depth. 
//
// The minimum depth is the number of nodes along the shortest path from the roo
//t node down to the nearest leaf node. 
//
// Note: A leaf is a node with no children. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: root = [2,null,3,null,4,null,5,null,6]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 105]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 444 👎 0


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
    public int minDepth(TreeNode root) {
        //1.bfs
//        int level = 0;
//        if(root == null) {
//            return level;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            level++;
//            int size = queue.size();
//            for(int i = 0; i < size;i++) {
//                TreeNode left = queue.poll();
//                if(left.left == null && left.right == null) {
//                    return level;
//                }
//                if(left.left != null)
//                queue.offer(left.left);
//                if(left.right != null)
//                queue.offer(left.right);
//            }
//        }
//        return level;
        //2.dfs
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(root.left != null) {
            left = minDepth(root.left);
        }
        if(root.right != null) {
            right = minDepth(root.right);
        }
        return left > right ? right + 1 : left + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
