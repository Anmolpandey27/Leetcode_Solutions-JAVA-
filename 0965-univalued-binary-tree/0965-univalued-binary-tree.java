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
    public boolean isUnivalTree(TreeNode root) {
        int uni=root.val;
        return unival(root,uni);
    }
    public boolean unival(TreeNode root,int uni){
        if(root==null)
        {
            return true;
        }
        if(root.val!=uni)
        {
            return false;
        }
        boolean left=unival(root.left,uni);
        boolean right=unival(root.right,uni);
        return left && right;
    }
}