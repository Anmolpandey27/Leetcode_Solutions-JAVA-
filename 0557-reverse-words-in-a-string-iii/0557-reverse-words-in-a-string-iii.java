class Solution {
    public String reverseWords(String s) {
        String ar[]=s.split(" ");
        String ans="";
        for(int i=0;i<ar.length;i++)
        {
           for(int j=ar[i].length()-1;j>=0;j--)
           {
               ans+=ar[i].charAt(j);
           }
           ans+=" ";
        }
        return ans.strip();
    }
    
}