class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length()){
            return false;
        }
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(char ch : word2.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for(char ch : word1.toCharArray()){
            if(!map2.containsKey(ch)){
                return false;
            }
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());
        
        Collections.sort(list1);
        Collections.sort(list2);
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i).intValue() != list2.get(i).intValue()){
                return false;
            }
        }
        
        return true;
    }
}