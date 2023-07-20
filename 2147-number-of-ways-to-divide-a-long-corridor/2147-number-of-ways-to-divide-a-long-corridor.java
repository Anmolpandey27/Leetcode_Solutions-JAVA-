class Solution {
    public int numberOfWays(String s) {
        int totalSeats=0;
        int seat=0;
        int plant=0;
        int mod=(int)((1e9)+7);
        long ans=1;
        boolean firstCorridor=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='S')
            {
                totalSeats++;
                seat++;
            }
            else if(seat==0)
            {
                plant++;
            }
            if(seat==2)
            {
                if(firstCorridor)
                {
                    ans=ans*(plant+1);
                    ans%=mod;
                }
                firstCorridor=true;
                seat=0;
                plant=0;
            }
        }
        if(totalSeats==0 ||(totalSeats&1)!=0)
        {
            return 0;
        }
        return (int)ans;
    }
}