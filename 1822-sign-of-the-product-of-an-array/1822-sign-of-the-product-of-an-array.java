class Solution {
    public int arraySign(int[] nums) {
        int i=0;
        int p=0;
        Arrays.sort(nums);
        while(i<=nums.length-1 && nums[i]<=0)
        {
            if(nums[i]==0)
            {
                return 0;
            }
            p++;
            i++;
        }
        return signFunc(p);
    }
    public int signFunc(int n)
    {
        if(n%2==0)
        {
            return 1;
        }
        return -1;
    }
}