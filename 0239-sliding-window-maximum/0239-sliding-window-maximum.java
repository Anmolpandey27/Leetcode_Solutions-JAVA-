class Solution {
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int len = nums.length;
		Deque<Integer> dq = new ArrayDeque<>(); 
		int[] ans = new int[nums.length-k+1];

		for(int i = 0;i<len;i++) {

			while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]) {
				dq.removeLast();
			}
			dq.add(i);
			if(dq.peekFirst() == i-k) {
				dq.removeFirst();
			}
			
			if(i>=k-1) {
				ans[i-(k-1)] = nums[dq.peek()];
			}
		}
		return ans;
	}
}
