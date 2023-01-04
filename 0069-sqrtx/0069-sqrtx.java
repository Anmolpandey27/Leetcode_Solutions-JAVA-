class Solution {
    public int mySqrt(int x) {
        long i=0;
        long n=x;
        long ans=0;
        while(i<=n)
        {
            long mid=i+(n-i)/2;
            if(mid*mid<=x)
            {
                ans=mid;
                i=mid+1;
            }
            else
            {
                n=mid-1;
            }
        }
        return (int)ans;
    }
}