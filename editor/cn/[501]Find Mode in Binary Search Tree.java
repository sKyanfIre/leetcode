//Given a binary search tree (BST) with duplicates, find all the mode(s) (the mo
//st frequently occurred element) in the given BST. 
//
// Assume a BST is defined as follows: 
//
// 
// The left subtree of a node contains only nodes with keys less than or equal t
//o the node's key. 
// The right subtree of a node contains only nodes with keys greater than or equ
//al to the node's key. 
// Both the left and right subtrees must also be binary search trees. 
// 
//
// 
//
// For example: 
//Given BST [1,null,2,2], 
//
// 
//   1
//    \
//     2
//    /
//   2
// 
//
// 
//
// return [2]. 
//
// Note: If a tree has more than one mode, you can return them in any order. 
//
// Follow up: Could you do that without using any extra space? (Assume that the 
//implicit stack space incurred due to recursion does not count). 
// Related Topics 树 
// 👍 269 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.HashMap;

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
    private Integer index = null;
    private Integer count = 0;
    private Integer maxCount = 0;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] result = new int[list.size()];
        int i = 0;
        for(Integer t : list) {
            result[i++] = t;
        }
        return result;
    }
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        if(index == null) {
            index = root.val;
            count = 1;
            maxCount = 1;
            list.add(root.val);
        }else {
            if(index == root.val) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                    list.clear();
                    list.add(root.val);
                }else if( count == maxCount) {
                    list.add(root.val);
                }
            }else {
                index = root.val;
                count = 1;
                if(count == maxCount) {
                    list.add(root.val);
                }
            }
        }
        inOrder(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
