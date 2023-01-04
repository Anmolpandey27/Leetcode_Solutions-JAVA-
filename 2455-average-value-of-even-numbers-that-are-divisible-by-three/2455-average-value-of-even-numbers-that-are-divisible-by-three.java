class Solution {
    public int averageValue(int[] nums) {
        int s=0;
        int c=0;
        for(int i:nums)
        {
            if(i%2==0 && i%3==0)
            {
                s+=i;
                c++;
            }
        }
        if(c!=0)
        {
            return s/c;   
        }
        return s;
    }
}