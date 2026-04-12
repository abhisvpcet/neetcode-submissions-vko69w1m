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

    private boolean isBalanced;
    public boolean isBalanced(TreeNode root) {
        this.isBalanced=true;
        this.height(root);
        return this.isBalanced;
      
    }

    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight= height(node.left);
        int rightHeight= height(node.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            this.isBalanced= false;
        }
        return Math.max(leftHeight, rightHeight)+1;
    }
}
