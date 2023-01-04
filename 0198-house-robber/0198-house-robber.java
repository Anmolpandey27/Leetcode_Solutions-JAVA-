class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i=nums.length-3;i>=0; i--){
            int add = 0;
            if(i+3 < nums.length){
               add = nums[i+3]; 
            }
            nums[i] += Math.max(nums[i+2],add);
        }
        return Math.max(nums[0], nums[1]);
    }
}