//You are given the root node of a binary search tree (BST) and a value to inser
//t into the tree. Return the root node of the BST after the insertion. It is guar
//anteed that the new value does not exist in the original BST. 
//
// Notice that there may exist multiple valid ways for the insertion, as long as
// the tree remains a BST after insertion. You can return any of them. 
//
// 
// Example 1: 
//
// 
//Input: root = [4,2,7,1,3], val = 5
//Output: [4,2,7,1,3,5]
//Explanation: Another accepted tree is:
//
// 
//
// Example 2: 
//
// 
//Input: root = [40,20,60,10,30,50,70], val = 25
//Output: [40,20,60,10,30,50,70,null,null,25]
// 
//
// Example 3: 
//
// 
//Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
//Output: [4,2,7,1,3,5]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree will be in the range [0, 104]. 
// -108 <= Node.val <= 108 
// All the values Node.val are unique. 
// -108 <= val <= 108 
// It's guaranteed that val does not exist in the original BST. 
// 
// Related Topics 树 
// 👍 167 👎 0


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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
//       insert(root,val);
       insert2(root,val);
       return root;
    }
    public TreeNode insert(TreeNode root,int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            TreeNode insert = insert(root.left, val);
            if(root.left == null) {
                root.left = insert;
            }
            return insert;
        } else {
            TreeNode insert = insert(root.right, val);
            if(root.right == null) {
                root.right = insert;
            }
            return insert;
        }
    }
    public void insert2(TreeNode root,int val) {
        while (root != null) {
            if (root.val > val) {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                    break;
                }
                root = root.left;
            } else {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                    break;
                }
                root = root.right;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
