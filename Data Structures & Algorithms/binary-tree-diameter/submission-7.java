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

    class pair{
        private int first;
        private int second;

        public pair(int x, int y){
            first=x;
            second=y;
        }
    }

   

    public int diameterOfBinaryTree(TreeNode root) {

        pair p=f(root);
        return p.first;

       
    }
    public pair f(TreeNode node){
        if(node==null){
            return new pair(0, 0);
        }
        else{
            pair left= f(node.left);
            pair right=f(node.right);

            int height=Math.max(left.second, right.second)+1;

            int diameter= Math.max(Math.max(left.first, right.first), left.second+right.second);
            return new pair(diameter, height);
        }
        

    }

}
