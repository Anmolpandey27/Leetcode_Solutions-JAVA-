class Solution {
    public String nearestPalindromic(String s) {
        if (s.equals("0")) {
            return "1";
        }
        
        if (s.length() == 1) {
            return String.valueOf(Long.parseLong(s) - 1);
        }
        
        boolean smaller = false;
        boolean bigger = false;
        
        char[] bytes = s.toCharArray();
        for (int i = 0; i <= (bytes.length - 1) / 2; i++) {
            int j = bytes.length - 1 - i;
            char l = bytes[i];
            char r = bytes[j];
            
            if (l == r) {
                continue;
            }
            
            if (l < r) {
                smaller = true;
                bigger = false;
                bytes[j] = l;
            }
            
            if (l > r) {
                bigger = true;
                smaller = false;
                bytes[j] = l;
            }
        }
        
        String small;
        String big;
        if (smaller) {
            small = new String(bytes);
            big = getBigger(bytes);
        } else if (bigger) {
            small = getSmaller(bytes);
            big = new String(bytes);
        } else {
            small = getSmaller(bytes);
            big = getBigger(bytes);
        }
        
        long smallGap = Math.abs(Long.parseLong(small) - Long.parseLong(s));
        long bigGap = Math.abs(Long.parseLong(big) - Long.parseLong(s));
        
        if (smallGap <= bigGap) {
            return small;
        } else {
            return big;
        }
    }
    
    String getSmaller(char[] bytes) {
        char[] small = Arrays.copyOf(bytes, bytes.length);
        int middle = (small.length - 1) / 2;
        while (middle >= 0 && small[middle] == '0') {
            small[middle] = '9';
            small[small.length - 1 - middle] = '9';
            middle--;
        }
        small[middle] = (char)(small[middle] - 1);
        small[small.length - 1 - middle] = small[middle];
        if (middle == 0 && small[middle] == '0') {
            for (int i = 1; i < small.length; i++) {
                small[i] = '9';
            }
            small = Arrays.copyOfRange(small, 1, small.length);
        } else {
            
        }
        return new String(small);
    }
    
    String getBigger(char[] bytes) {
        char[] bigger = Arrays.copyOf(bytes, bytes.length);
        int middle = (bigger.length - 1) / 2;
        while (middle >= 0 && bigger[middle] == '9') {
            bigger[middle] = '0';
            bigger[bigger.length - 1 - middle] = '0';
            middle--;
        }
        if (middle == -1) {
            char[] shadow = new char[bigger.length + 1];
            shadow[0] = '1';
            shadow[shadow.length - 1] = '1';
            for (int i = 1; i < shadow.length - 1; i++) {
                shadow[i] = '0';
            }
            bigger = shadow;
        } else {
            bigger[middle] = (char)(bigger[middle] + 1);
            bigger[bigger.length - 1 - middle] = bigger[middle];
        }
        return new String(bigger);
    }
}