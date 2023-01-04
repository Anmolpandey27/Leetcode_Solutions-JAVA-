class Solution {
    public int primePalindrome(int N) {
     if(N==1 ||N==2)
         return 2;
    if(N%2==0)
        N=N+1;
        
     while(true){
           if( palindrome(N) && prime(N) ){
               return N;
           } 
         N+=2;
         
         if (10_000_000 < N && N < 100_000_000)
                N = 100_000_001;
     }  
    }
    public boolean palindrome(int N){
        if(N%10==0 && N!=0)
            return false;
        
        int reverseNumber=0;
        int num=N;
        while(num>0){
            reverseNumber=reverseNumber*10+num%10;
            num/=10;    
        }
        return reverseNumber==N || N== reverseNumber / 10;
    }
    public boolean prime(int N){
        if(N%2==0) return false;
        
        for(int i=3;i<N/2+1; i+=2)
              if(N%i==0)
                  return false;
        return true;
    }
}