class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list0=new ArrayList<>();
        List<Integer> list1=new ArrayList<>(nums1.length);
        for (int element: nums1) {
            list1.add(element);
        }
        List<Integer> list2=new ArrayList<>(nums2.length);
        for (int element: nums2) {
            list2.add(element);
        }
        for(int element:list1){
            if (list2.contains(element)){
                if (list0.contains(element));
                else list0.add(element);
            }
        }
        int[] finalarr=new int[list0.size()];
        for (int i=0;i<list0.size();i++) {
            finalarr[i]=list0.get(i);
        }
        return finalarr;
    }
}