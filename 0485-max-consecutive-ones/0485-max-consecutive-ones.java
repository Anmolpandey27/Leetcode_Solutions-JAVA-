class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int max = 0;

        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] == 1)
            {
                counter++;
                if(counter > max)
                {
                    max = counter;
                }
                i++;
            }
            else
            {
                counter = 0;
                i++;
            }
        }

        return max;
    }
}