class Solution {
    public String getPermutation(int n, int k) {
        String ans = "";
        int fact = 1;
        ArrayList<Integer> nums = new ArrayList();
        
        for (int i=1; i<n; i++){
            fact *= i;
            nums.add(i);
        }
        nums.add(n);
        k--;
        
        while(true){
            ans+=nums.get(k/fact);
            nums.remove(k/fact);
            n--;
            
            if (nums.size()==0) break;
            
            k = k % fact;
            fact = fact / n;
        }
        return ans;
    }
}