class Solution {
    public int countDigitOne(int n) {
        if (n == 0){
            return 0;
        }
        
        int cnt = 0;
        for(int i = 1; i <= n; i *= 10){
            int high = n / i / 10;
            int curr = n / i % 10;
            int low = n % i;
            
            if (curr == 0){
                cnt += high * i;
            }
            else if (curr == 1){
                cnt += high * i + low + 1;
            }
            else {
                cnt += high * i + i;
            }
        }
        
        return cnt;
    }
}