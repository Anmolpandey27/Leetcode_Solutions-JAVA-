class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] copy = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(copy);
        
        HashMap<Integer, Integer> rank = new HashMap<>();
        
        for(int n : copy) {
            
            rank.putIfAbsent(n, rank.size() + 1);
        }
        
        for(int i = 0; i < arr.length; i++) {
            
            copy[i] = rank.get(arr[i]);
        }
        
        return copy;
    }
}