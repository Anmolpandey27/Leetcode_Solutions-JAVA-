class Solution {
    public int trap(int[] arr) {
        return Rain_Traping( arr);
    }
    public static int Rain_Traping(int[] arr) {

		int[] left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		int[] right = new int[arr.length];
		int n = arr.length;
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < right.length; i++) {
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		return sum;

	}
}