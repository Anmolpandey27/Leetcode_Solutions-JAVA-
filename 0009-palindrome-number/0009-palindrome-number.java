class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int s=0;
        while(n!=0)
        {
            s=s*10+(n%10);
            n=n/10;
        }
        if(s==x && x>=0)
        {
            return true;
        }
        else return false;
    }
}