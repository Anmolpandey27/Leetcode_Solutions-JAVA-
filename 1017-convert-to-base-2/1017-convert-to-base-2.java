class Solution {
    public String baseNeg2(int N) {
        if(N==0){
            return "0";
        }
        String ans="";
        while(N!=0){
            if(N%(-2)==-1){
                ans=1+ans;
            }
            else{
                ans=N%(-2)+ans;
            }
            if(N%(-2)==-1){
                N/=-2;
                N++;
                continue;
            }
            N/=-2;
        }return ans;
    }
}