class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> values = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        
        int n = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int n1 = values.get(s.charAt(i));
            if (i == 0) {
                n += n1;
                continue;
            }
            int n2 = values.get(s.charAt(i - 1));
            if (n2 < n1) {
                i--;
                n += n1 - n2;
            } else {
                n += n1;
            }
        }
        return n;
    }
}