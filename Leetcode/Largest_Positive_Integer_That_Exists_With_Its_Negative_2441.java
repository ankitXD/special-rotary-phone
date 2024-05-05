package Leetcode;

import java.util.Arrays;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative_2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/
		//02-05-2024
		int[] arr = { -1, 10, 6, 7, -7, 1 };
		System.out.println(findMaxK(arr));
	}

	public static int findMaxK(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
				return nums[i];
			}
		}
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = nums.length - 1; j >= 0; j--) {
//				if(nums[j]==-nums[i]) {
//					return nums[j];
//				}
//			}
//		}
		return -1;
	}

}
