class Solution {
    public String[] words;
    public List<Integer> result;
    public int substringSize;
    public HashSet<Character> chars;
    public HashMap<String, Integer> map;
   
    public boolean check(String s) {
       HashMap<String, Integer> currMap = new HashMap<String, Integer>();
       for (int i = 0; i + words[0].length() <= s.length(); i = i + words[0].length()) {
           for (int j = 0; j < words.length; j++) {
               if (i + words[j].length() > s.length()) {
                   break;
               }
               if (s.charAt(i) == words[j].charAt(0) && s.substring(i, i + words[j].length()).equals(words[j])) {
                   currMap.put(words[j], currMap.getOrDefault(words[j], 0) + 1);
                   break;
               }
           }
       }
      
       
       for (String key: map.keySet()) {
           if (!currMap.getOrDefault(key, 0).equals(map.get(key))) {
               return false;
           }
       }
       
      
       return true;
       
    }
    public List<Integer> findSubstring(String s, String[] words) {
      this.words = words;
      this.substringSize = 0;
      this.result = new ArrayList<Integer>();
      this.chars = new HashSet<Character>();
      this.map = new HashMap<String, Integer> ();
      HashSet<Character> vis = new HashSet<Character> ();
      
      for (int i = 0; i  < words.length; i ++) {
          chars.add(words[i].charAt(0));
          substringSize = substringSize + words[i].length();
          map.put(words[i], map.getOrDefault(words[i], 0) + 1);
      }
  
    System.out.println(map);
      for (int i = 0; i + substringSize <= s.length(); i ++) {
          if (chars.contains(s.charAt(i)) && check(s.substring(i, i + substringSize))) {
              result.add(i);
          }
      } 
      return result;
        
    }
}