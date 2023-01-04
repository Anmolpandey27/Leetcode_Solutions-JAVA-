class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<1; i++){
            transpose(matrix);
            swapColumn(matrix,0,matrix.length);
        }
    }
    
    public void transpose(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<i; j++){
                swap(mat,i,j);
            }
        }
    }
    
    public void swapColumn(int mat[][], int a, int b){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-j-1];
                mat[i][mat.length-j-1] = temp;
            }
        }
    }
    
    public void swap(int mat[][], int i, int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}