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

    private int count;
    public int goodNodes(TreeNode root) {
        preorder(root, -2000);
        return count;
        
    }

    void preorder(TreeNode node, int maxTillParent){
        if(node!=null){
            if(node.val>=maxTillParent){
                count++;
            }

            int maxForMyChild= Math.max(maxTillParent, node.val);

            preorder(node.left, maxForMyChild);
            preorder(node.right, maxForMyChild);
        }
    }
}
