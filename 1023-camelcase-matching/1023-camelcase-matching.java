class Solution {
    public List<Boolean> camelMatch(String[] queries, String pat) {
        List<Boolean> list = new ArrayList();
        for(String str : queries) {
            int idx = 0, i;
            for(i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(idx >= pat.length() && ch >= 'A' && ch <= 'Z')
                    break;
                
                if(idx < pat.length() && ch == pat.charAt(idx))
                    idx++;
                
                else if(ch >= 'A' && ch <= 'Z' && ch != pat.charAt(idx))
                    break;
                
            }
            if(i == str.length() && idx == pat.length())
                list.add(true);
            else 
                list.add(false);   
        }
        return list;
        
    }
}