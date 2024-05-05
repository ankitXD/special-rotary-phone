package Leetcode;

import java.util.Arrays;

public class Longest_Consecutive_Sequence_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/longest-consecutive-sequence/description/
		int[] arr = { 10, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(longestConsecutive(arr));
	}

	public static int longestConsecutive(int[] nums) {
		int n = nums.length;

		if (n == 0) {
			return 0;
		}
		Arrays.sort(nums);

		int count = 1;
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (nums[i] != nums[i - 1]) {
				if (nums[i] == nums[i - 1] + 1) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 1;
				}
			}
		}

		return max;
	}

}
