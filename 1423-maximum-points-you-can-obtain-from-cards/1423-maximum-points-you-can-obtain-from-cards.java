class Solution {
    public int maxScore(int[] cardPoints, int k) {
        final int n = cardPoints.length;
        int sum = 0, maxSum = 0;
        for (int i = n - k, j = i; j < n; i++) {
            if (i == n && j == 0) return maxSum;
            sum += cardPoints[i % n];
            if (i - j == k) {
                sum -= cardPoints[j];
                j++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}