class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] existingNums = new boolean[n + 1];
        
        for (int i = 0; i < n; i++) {
            existingNums[nums[i]] = true;
        }
        
        List<Integer> missingNums = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(!existingNums[i]) {
                missingNums.add(i);
            }
        }
        
        return missingNums;
    }
}