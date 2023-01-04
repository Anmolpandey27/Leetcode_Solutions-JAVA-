class Solution {
    public int uniqueLetterString(String s) {
        int[] charactersLastIdx = new int[26];
        Arrays.fill(charactersLastIdx, -1);
        
        int[] currentCharContribution = new int[26];
        
        int totalUniqueCharSubstrings = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            currentCharContribution[idx] = i+1 - (charactersLastIdx[idx] + 1);
            
            for(int j = 0; j < 26; j++) totalUniqueCharSubstrings += currentCharContribution[j];
            
            charactersLastIdx[idx] = i;
        }
        
        return totalUniqueCharSubstrings;
    }
}