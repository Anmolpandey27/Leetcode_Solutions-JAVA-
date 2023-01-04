class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxLength = 0;
        for(int element : map.keySet()){
            if(map.containsKey(element+1)){
                maxLength = Math.max(maxLength, map.get(element) + map.get(element + 1));
            }
        }
        return maxLength;
    }
}