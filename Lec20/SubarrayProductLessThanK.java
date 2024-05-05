package Lec20;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(numSubarrayProductLessThanK(nums, k));
	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while (ei < nums.length) {
			// grow
			p = p * nums[ei];

			// shrink
			while (p >= k && si <= ei) {
				p = p / nums[si];
				si++;
			}

			// ans calculate
			ans = ans + (ei - si + 1);
			ei++;
		}

		return ans;
	}

}
