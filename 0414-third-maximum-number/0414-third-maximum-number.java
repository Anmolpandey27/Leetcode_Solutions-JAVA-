class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        if(list.size()<3)return Collections.max(list);
        int max=0,n=list.size(),count=0;
        for(int i=0;i<n;i++){
            max=Collections.max(list);
            list.remove(Integer.valueOf(max));
            count++;
            if(count==3)break;
        }
        return max;
    }
}