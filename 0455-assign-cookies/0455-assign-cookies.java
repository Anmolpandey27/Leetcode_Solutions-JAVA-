class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0;
        int j=0;
        int contentChildrenNumber = 0;
        
        int gLen = g.length;
        int sLen = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i < gLen && j < sLen ){
            if(s[j] >= g[i]){
                contentChildrenNumber++;
                i++;
                j++;
				//and move the pointers
            }else{
                j++;
            }
        }
        
        return contentChildrenNumber;
        
    }
}