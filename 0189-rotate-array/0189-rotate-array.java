class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int i,int f) {
        while(i<f)
        {
            int temp = nums[i];
            nums[i] = nums[f];
            nums[f] = temp;
            i++;
            f--;
        }
    }
}