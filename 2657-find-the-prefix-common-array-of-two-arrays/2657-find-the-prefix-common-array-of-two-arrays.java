class Solution {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[A.length];
        int expectedSize = 2;
        for(int i = 0; i< A.length; i++){
            set.add(A[i]);
            set.add(B[i]);

            ans[i] = expectedSize-set.size();
            expectedSize+=2;
        }
        return ans;
    }
}