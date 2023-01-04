class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums); //sort the array
        int n=nums.length; //length of the array
        int ans=nums[n-1]-nums[0];
        int min=nums[0]+k;
        int max=nums[n-1]-k;
        for(int i=0;i<n-1;i++){
            int mx=Math.max(max,nums[i]+k); //just maximize the ith ele
            int mi=Math.min(min,nums[i+1]-k); //just minimize the (i+1) ele
                ans=Math.min(ans,mx-mi);
        }
        return ans;
    }
}