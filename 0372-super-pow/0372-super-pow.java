class Solution {
    public int superPow(int a, int[] b) {
        long ret = 1;
        for (int b_idx=b.length-1; b_idx>=0; b_idx--) {
            for (int kk=0; kk < b[b_idx]; kk++) {
                ret *= a;
                ret %= 1337;
            }
            long newa = 1;
            for (int kk=0; kk < 10; kk++) {
                newa = newa * a;
                newa %= 1337;
            }
            a = (int)newa;
        }

        return (int)ret;
    }
}
