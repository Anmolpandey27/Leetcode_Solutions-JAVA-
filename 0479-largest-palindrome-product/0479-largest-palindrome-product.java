public class Solution {
    int result = 0;
    boolean found = false;

    public int largestPalindrome(int n) {
        if(n == 1) return 9;
        StringBuilder sb = new StringBuilder();
        solve(sb, 9, n);
        return result;
    }
    
    public void solve(StringBuilder sb, int n, int len){
        if(found) return;
        if(sb.length() == len*2){
            long x = Long.parseLong(sb.toString());
            int upperBound = (int) Math.pow(10, len) - 1; 
            int lowerBound = upperBound / 10;

            for(int div = upperBound; div > lowerBound; div--){
                if(x/div > upperBound) return;
                if(x % div == 0) {
                    found = true;
                    result = (int) (x % 1337);
                    return;
                }
            }
            return;
        }
        
        for(int i = n; i >= 0; i--){
            if(found) return;
            sb.insert(sb.length()/2, i+""+i);
            solve(sb, 9, len);
            int idx = (sb.length()-1)/2;
            sb.delete(idx,idx+2);
        }
    }
}