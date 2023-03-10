class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        
        int guaranteed = 0, maxGrumpyCust = 0, currGrumpy = 0, i = 0, j = 0;
        
        while(i < grumpy.length) {
            if (grumpy[i] == 0) {
                guaranteed += customers[i];
            } else {
                currGrumpy += customers[i];
                while (i - j >= X) {
                    if (grumpy[j] == 1)
                        currGrumpy -= customers[j];
                    j++;
                }
                
                maxGrumpyCust = Math.max(currGrumpy, maxGrumpyCust);
            }
        
            i++;
        }
        
        return guaranteed + maxGrumpyCust;
    }
}