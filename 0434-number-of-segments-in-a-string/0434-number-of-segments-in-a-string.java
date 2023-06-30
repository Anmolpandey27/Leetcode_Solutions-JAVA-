class Solution {
    public int countSegments(String s) {
        String ar[]=s.trim().split("\\s+");
        if(s.trim().length()==0)
        {
            return 0;
        }
        return ar.length;
    }
}