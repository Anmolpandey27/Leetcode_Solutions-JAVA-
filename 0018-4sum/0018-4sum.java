class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n= nums.length;
        List<List<Integer>> result= new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                long sum = nums[i]+nums[j];
                long remaining= (long)target-sum;
                
                int left= j+1;
                int right= n-1;
                
                while(left< right){
                    if(nums[left]+ nums[right] < remaining){
                        left++;
                    }
                    else if(nums[left]+ nums[right]> remaining){
                        right--;
                    }
                    else{
                        List<Integer> l1= new ArrayList<>();
                        
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[left]);
                        l1.add(nums[right]);
                        
                        result.add(l1);
                        
                        while(left < right && l1.get(2) == nums[left]){
                            left++;
                        }
                        
                        while(left < right && l1.get(3) == nums[right]){
                            right--;
                        }
                    }
                }
                
                while(j<n-1 && nums[j] == nums[j+1]){
                    j++;
                }
                
                while(i<n-1 && nums[i] == nums[i+1]){
                    i++;
                }
            }
        }
        
        return result;
    }
}