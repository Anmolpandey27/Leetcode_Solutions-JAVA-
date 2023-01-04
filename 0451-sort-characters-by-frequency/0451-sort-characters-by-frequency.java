class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);   
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> e1, Map.Entry<Character,Integer> e2){
                return e2.getValue() - e1.getValue();
            }
        });
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Character,Integer> itr: list){
            int freq = itr.getValue();
            while(freq!=0){
                str.append(itr.getKey()); 
                freq--;               
            }
        }
        return str.toString();
    }
}