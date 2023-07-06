class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return Differnt(expression);
    }
    public static List<Integer> Differnt(String s)
    {
        if(s.indexOf('+')==-1 && s.indexOf('-')==-1 && s.indexOf('*')==-1)
        {
            List<Integer> ll= new ArrayList<>();
            ll.add(Integer.parseInt(s));
            return ll;
        }
        List<Integer> ans=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(check(ch))
            {
                List<Integer> left=Differnt(s.substring(0,i));
                List<Integer> right=Differnt(s.substring(i+1));
                for(int a:left)
                {
                    for(int b:right)
                    {
                        int val=Cal(a,b,ch);
                        ans.add(val);
                    }
                }
            }
        }
        return ans;
    }
    public static boolean check(char ch)
    {
        if(ch=='+' || ch=='-' || ch=='*')
        {
            return true;
        }
        return false;
    }
    public static int Cal(int a,int b,char ch)
    {
        if(ch=='+')
        {
            return a+b;
        }
        else if(ch=='-')
        {
            return a-b;
        }
        else
        {
            return a*b;
        }
    }
}