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
        int ans[]= {Integer.MIN_VALUE};
        int j=sum(root,ans);
        return ans[0];
    }
    public int sum(TreeNode root,int[] ans)
    {
        if(root==null)
        {
            return 0;
        }
        int left=sum(root.left,ans);
        int right=sum(root.right,ans);
        int temp=Math.max(Math.max(left,right)+root.val,root.val);
        int res=Math.max(left+right+root.val,temp);
        ans[0]=Math.max(ans[0],res);
        return temp;
    }
}