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
    public int maxPathSum(TreeNode root) {
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        sum(root, maxi);
        return maxi[0];
    }
    public int sum(TreeNode root, int[] maxi){
        if(root == null){
            return 0;
        }
        int l = Math.max(0, sum(root.left, maxi));   // if left of root is negative return 0
        int r = Math.max(0, sum(root.right, maxi));  // if right of root is negative retun 0
        
        
        maxi[0] = Math.max(maxi[0], root.val + l + r);
        
        return root.val + Math.max(l, r);
    }
}