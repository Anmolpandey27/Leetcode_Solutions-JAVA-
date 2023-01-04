class Solution {
    public int smallestEvenMultiple(int n) {
        int c=n;
        while(n%2==0 && n>=c)
        {
            n/=2;
        }
        return n*2;
    }
}