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



//DFS

 
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         int l = maxDepth(root.left);
//         int r = maxDepth(root.right);
        
//         return 1 + Math.max(l, r);
        
//     }
// }



//BFS

class Solution{
    public int maxDepth(TreeNode root){
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return 0;
        }
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            int level = queue.size();
            
            for(int i = 0; i < level; i++){
               root = queue.poll();

                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
            count++;
        }
        return count;
    }
}