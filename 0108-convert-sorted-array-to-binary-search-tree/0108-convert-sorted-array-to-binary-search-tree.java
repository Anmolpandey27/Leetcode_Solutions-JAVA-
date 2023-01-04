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

    TreeNode root;

    TreeNode add(Integer val){
        root = recursionAdd(root, val);
        return root;
    }

    TreeNode recursionAdd(TreeNode current, Integer val){
        if(current == null){
            return new TreeNode(val);
        }
        if(current.val < val){
            current.right = recursionAdd(current.right, val);
        }
        if(current.val > val){
            current.left = recursionAdd(current.left, val);
        }
        return current;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        append(nums,0, nums.length);
        return root;
    }

    void append(int arr[], int l, int r){
        {
        if (l < r) {
            int m = l + (r - l) / 2;
            add(arr[m]);
            append(arr, l, m);
            append(arr, m + 1, r);
        }
    }
    }
}