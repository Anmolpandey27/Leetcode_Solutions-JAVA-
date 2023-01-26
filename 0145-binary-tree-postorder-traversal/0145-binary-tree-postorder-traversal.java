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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ar=new ArrayList<>();
        return postorder(root,ar);
    }
    public List<Integer> postorder(TreeNode root,List<Integer> ar)
    {
        if(root==null)
        {
            return ar;
        }
        postorder(root.left,ar);
        postorder(root.right,ar);
        ar.add(root.val);
        return ar;
    }
}