//Given the root of a binary tree, return the postorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [3,2,1]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [2,1]
// 
//
// Example 5: 
//
// 
//Input: root = [1,null,2]
//Output: [2,1]
// 
//
// 
// Constraints: 
//
// 
// The number of the nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//
// Follow up: 
//
// Recursive solution is trivial, could you do it iteratively? 
//
// 
// Related Topics 栈 树 
// 👍 522 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Deque;
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
    public List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
//        postOrderRecursive(root);
        postOrderIterator(root);
        return result;
    }
    public void postOrderRecursive(TreeNode root) {
        if(root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            result.add(root.val);
        }
    }
    public void postOrderIterator(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;

            }
            root = stack.pop();
            if(root.right == null || prev == root.right) {
                // 当前节点为左节点/当前节点的右节点已经遍历
                result.add(root.val);
                prev = root;
                root = null;
            }else{
                // 当前节点的右节点未遍历，当前节点入栈
               stack.push(root);
               // 切换当前节点为右节点
               root = root.right;
            }

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
