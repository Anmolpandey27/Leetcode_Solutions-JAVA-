class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])count++; 
            else if(count%2==0 && nums[i]!=nums[i+1]) count++;
            else return nums[i];          
        }
        return nums[nums.length-1];
    }
}