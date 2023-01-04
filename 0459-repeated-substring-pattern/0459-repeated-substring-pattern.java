class Solution {
    public boolean helper(char[] arr, int len) {
        int n = arr.length;
        if(n%len!=0)
            return false;
        for(int i=len;i<n;i++){
            if(arr[i] != arr[i%len])
                return false;
        }
        return true;
    }
    public boolean repeatedSubstringPattern(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            if(helper(arr, i+1))
                return true;
        }
        return false;
    }
}