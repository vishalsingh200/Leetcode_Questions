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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++){
            minimum = Math.min(minimum, list.get(i+1) - list.get(i));
        }
        return minimum;
    }
    public void helper(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}