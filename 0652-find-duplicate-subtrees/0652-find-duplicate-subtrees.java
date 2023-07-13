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
        HashMap<String,TreeNode> map=new HashMap<>();
        HashSet<TreeNode> set =new HashSet<>();
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            DuplicateSubtree(root);
            return new ArrayList<>(set);
            
    }
    public String DuplicateSubtree(TreeNode root)
    {
        if(root==null)
        {
            return "X";
        }
        String left=DuplicateSubtree(root.left);
        String right=DuplicateSubtree(root.right);
        String s=root.val+" "+left+" "+right;
        if(map.containsKey(s))
        {
            set.add(map.get(s));
        }
        else
        {
            map.put(s,root);
        }
        return s;
    }
}