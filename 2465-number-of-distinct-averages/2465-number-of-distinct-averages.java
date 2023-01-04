class Solution {
    public int distinctAverages(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Double> set = new TreeSet<>();
        
        while(list.size() != 0){
            list =  list.stream().sorted().collect(Collectors.toList());
            int max = list.get(list.size() - 1);
            int min = list.get(0);
            list.remove(new Integer(max));
            list.remove(new Integer(min));
            
            double d = (double) (max + min )/2;
            set.add(d);
        }
        
        return set.size();
    }
}