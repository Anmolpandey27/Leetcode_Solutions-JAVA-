class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int maxLocal[][] = new int[n-2][n-2];
        for(int i=0; i<n-2;i++){
            for(int j=0; j<n-2; j++){
                maxLocal[i][j] = maxFind(grid,i,j);
            }
        }
        return maxLocal;
    }
    private int maxFind(int arr[][], int i_Start, int j_Start){
        int max = Integer.MIN_VALUE;
        for(int i=i_Start; i<i_Start+3; i++){
            for(int j=j_Start; j<j_Start+3; j++){
                max = Math.max(max,arr[i][j]);
            }
        }
        return max;
    }
}