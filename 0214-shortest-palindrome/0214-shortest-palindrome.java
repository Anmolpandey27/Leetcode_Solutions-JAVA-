class Solution {
    public String shortestPalindrome(String s) {
        if(s.isEmpty())
            return s;
        String rev = new StringBuilder(s).reverse().toString();
        String merged = s + rev;        
        int lps = getLPS(merged, s.length());
        if(lps >= s.length())
            return s;
        String sub = s.substring(lps);
        return new StringBuilder(sub).reverse().append(s).toString();
    }
    
    int getLPS(String str, int length){
        int[] lps = new int[str.length()];
        int i=1, j=0;
        while(i < str.length()){
            if(i == length)
                j = 0;
            if(str.charAt(i) == str.charAt(j)){
                lps[i] = j+1;
                i++;
                j++;
            } else {
                if(j > 0){
                    j = lps[j-1];
                } else {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps[str.length()-1];
    }
}