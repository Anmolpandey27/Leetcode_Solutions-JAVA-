class Solution {
    public char findTheDifference(String s, String t) {
        String str1 = sort(s);
        String str2 = sort(t);

        for(int i = 0 ; i < str1.length() ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return str2.charAt(i);
            }
        }

        return str2.charAt(str1.length());
    }

    String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}