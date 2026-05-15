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

    class Pair{
        int level;
        TreeNode node;

        public Pair(int level, TreeNode node){
            this.level= level;
            this.node= node;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<Pair> queue= new LinkedList<>();
        List<List<Integer>> answer= new ArrayList<>();

        if(root==null){
            return Collections.emptyList();
        }

        queue.offer(new Pair(1, root));
        while(!queue.isEmpty()){
            Pair top=queue.poll();
            
            addToAnswer(answer, top.level, top.node);

            if(top.node.left!=null){
                queue.offer(new Pair(top.level+1, top.node.left));
            }
            if(top.node.right!=null){
                queue.offer(new Pair(top.level+1, top.node.right));
            }

        }
        return answer;

        
    }

    private void addToAnswer(List<List<Integer>> answer, int level, TreeNode node){
        if(level>answer.size()){
            answer.add(new ArrayList<>());
        }
        answer.get(level-1).add(node.val);
    }
}
