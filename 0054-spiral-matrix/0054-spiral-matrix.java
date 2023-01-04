class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return PrintSpiral(matrix);
    }
    public static List<Integer> PrintSpiral(int[][] arr) {
        List<Integer> ans=new ArrayList<>();
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int count = 0;
		int te = arr.length * arr[0].length;
		while (count < te) {
			for (int i = minc; i <= maxc && count < te; i++) {
				//System.out.print(arr[minr][i] + " ");
                ans.add(arr[minr][i]);
				count++;

			}
			minr++;
			for (int i = minr; i <= maxr && count < te; i++) {
				//System.out.print(arr[i][maxc] + " ");
                ans.add(arr[i][maxc]);
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < te; i--) {
				//System.out.print(arr[maxr][i] + " ");
                ans.add(arr[maxr][i]);
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < te; i--) {
				//System.out.print(arr[i][minc] + " ");
                ans.add(arr[i][minc]);
				count++;
			}
			minc++;

		}
        return ans;

	}
}