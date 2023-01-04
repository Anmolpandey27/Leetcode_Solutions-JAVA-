class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            
            int j = i+1;
            int k = nums.length-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                } else  {
                    int diff = Math.abs(target - sum);
                    if (diff < min) {
                        min = diff;
                        closestSum = sum;
                    }
                    if (sum > target) 
                        k--;
                    else
                        j++;
                }
            }
        }

        return closestSum;
    }
}