package Leetcode;

public class Maximum_Average_Subarray_I_643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-average-subarray-i/description
		// 29-04-2024
		// https://leetcode.com/problems/maximum-average-subarray-i/solutions/5047396/simple-sliding-window-solution
		int[] arr = { 1, 12, -5, -6, 50, 0, -45, 23 };
		int k = 4;
		System.out.println(findMaxAverage(arr, k));
	}

	public static double findMaxAverage(int[] nums, int k) {
		double ans = 0;
		double sum = 0;

		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}

		ans = sum / k;
		for (int i = k; i < nums.length; i++) {
			sum = nums[i] - nums[i - k];
			// sum = sum - nums[i-k];
			ans = Math.max(ans, sum / k);
		}

		return ans;
	}

}
