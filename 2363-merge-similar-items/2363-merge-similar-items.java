class Solution {
public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i[]:items1) {
            map.put(i[0],i[1]);
        }
        for(int i[]:items2) {
            if(map.containsKey(i[0])){
                map.put(i[0],map.get(i[0])+i[1]);   
            } else {
                map.put(i[0],i[1]);   
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curr;
        for(int i:map.keySet()) {
            curr = new ArrayList<>();
            curr.add(i);
            curr.add(map.get(i));
            ret.add(curr);
        }
        return ret;
    }
}