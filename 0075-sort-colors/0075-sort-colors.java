class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) r++;
            else if (nums[i]==1) w++;
            else b++;
        }
        for(int i=0;i<r;i++)
        {
            nums[i]=0;
        }
        for(int j=r;j<r+w;j++)
        {
            nums[j]=1;
        }
        for(int k=r+w;k<nums.length;k++)
        {
            nums[k]=2;
        }
    }
}