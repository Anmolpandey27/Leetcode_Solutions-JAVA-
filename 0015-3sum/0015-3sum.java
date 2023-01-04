class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length < 3) return new ArrayList<>(list);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) 
                continue;
            int j = i+1;
            int k = nums.length - 1; 
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum > 0) k--;
                else if (sum < 0) j++;
                else {
                    list.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    while (nums[j] == nums[j-1] && j<k) j++;
                    while (nums[k] == nums[k+1] && j<k) k--; 
                }
            }
        }
        
        return list;
    }
}