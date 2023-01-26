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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ar=new ArrayList<>();
        return preorder(root,ar);
    }
    public List<Integer> preorder(TreeNode root,List<Integer> ar)
    {
        if(root==null)
        {
            return ar;
        }
        ar.add(root.val);
        preorder(root.left,ar);
        preorder(root.right,ar);
        return ar;
    }
}