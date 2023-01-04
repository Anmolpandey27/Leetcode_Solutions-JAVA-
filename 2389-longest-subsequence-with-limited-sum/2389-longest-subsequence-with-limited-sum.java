class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int ans[]= new int[queries.length];
        for(int i=0; i<queries.length; i++)
        {
            int count=0, sum=0;
            for(int j=0; j<nums.length; j++)
            {
                sum+=nums[j];
                count++;
                
                if(sum>queries[i]){
                    count=count-1;
                    ans[i]=(count);
                    System.out.println(count);
                    break;
                }
            }
            if(count==nums.length) ans[i]=count;
        }
        return ans;
    }
}