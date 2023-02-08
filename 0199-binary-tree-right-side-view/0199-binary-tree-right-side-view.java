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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ar=new ArrayList<>();
        rview(root,ar,0);
        return ar;
    }
    public static void rview(TreeNode root,List<Integer> ar,int d)
    {
        if(root==null)
        {
            return;
        }
        if(ar.size()==d)
        {
            ar.add(root.val);
        }
        rview(root.right,ar,d+1);
        rview(root.left,ar,d+1);
    }
}