class Solution {
    public int subsetXORSum(int[] nums) {
        return go(nums, 0, 0);
    }
    public int go(int[] nums, int i, int xor) {
        if (i == nums.length) return xor;
        return go(nums, i + 1, xor ^ nums[i]) + go(nums, i + 1, xor);
    }
}