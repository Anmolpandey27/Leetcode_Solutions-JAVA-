class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        String s1=s.substring(0,n);
        String s2=s.substring(n);
        if(cnt_vowel(s1)==cnt_vowel(s2))
        {
            return true;
        }
        return false;
    }
    public int cnt_vowel(String s)
    {
        int c=0;
        for(char i:s.toCharArray())
        {
            if(i=='a' ||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
            {
                c++;
            }
        }
        return c;
    }
}