class Solution
{
    public static void moveZeroes(int[] nums) {
		int j=0,zeroCount=0,len=nums.length;
        for(int i=0;i<len;i++) {
        	if(nums[i]==0) {
        		zeroCount++;	continue;
        	}
        	else nums[j++]=nums[i];
        }
        for(int i=len-zeroCount;i<len;i++) nums[i]=0;
    }
}