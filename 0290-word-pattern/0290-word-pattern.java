class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []str = s.split(" ");
        if(str.length != pattern.length())
            return false;
        int n = str.length;
        HashMap<String,String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        for(int i = 0;i < n; i++){
            String temp = pattern.substring(i,i+1);
            if(hm.containsKey(temp) && !hm.get(temp).equals(str[i]))
            return false;
            if(!hm.containsKey(temp)){
                if(hs.contains(str[i]))
                    return false;
                hm.put(temp,str[i]);
                hs.add(str[i]);
            }
        }
        return true;
    }
}
