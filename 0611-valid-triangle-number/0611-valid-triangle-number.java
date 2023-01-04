class Solution {
    public int triangleNumber(int[] nums) {
        
    Arrays.sort(nums);
    int res = 0;
        
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        int sum = nums[i] + nums[j];
        int left = j + 1, right = nums.length - 1;
          
        while (left < right - 1) {
          int mid = left + (right - left) / 2;
          if (nums[mid] >= sum) right = mid - 1;
          else left = mid;
        }
        if (nums[right] < sum) {
          res += (right - j);
        } else if (nums[left] < sum) {
          res += (left - j);
        }
      }
    }
    return res;
    }
}