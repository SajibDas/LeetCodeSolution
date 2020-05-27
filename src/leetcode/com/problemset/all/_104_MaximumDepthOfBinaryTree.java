/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _104_MaximumDepthOfBinaryTree {

    /**
     * Problem : https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * @param root
     * @return
     */
	public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(
                root.left == null ? 0 : maxDepth(root.left),
                root.right == null ? 0 : maxDepth(root.right));
    }
    
    
     // Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
     }
     
}
