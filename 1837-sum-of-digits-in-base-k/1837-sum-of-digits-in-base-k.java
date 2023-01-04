class Solution {
    public int sumBase(int n, int k) {
        int res=Dec(k,n);
        int sum=0;
        while(res>0)
        {
            int rem=res%10;
            sum+=rem;
            res/=10;
        }
        return sum;
        
    }
    public static int Dec(int db,int num)
	{
		int ans = 0;
		int m = 1;
		while (num > 0) {
			int rem = num % db;
			ans = ans + rem * m;
			m = m * 10;
			num = num / db;

		}
        return ans;
	}
}