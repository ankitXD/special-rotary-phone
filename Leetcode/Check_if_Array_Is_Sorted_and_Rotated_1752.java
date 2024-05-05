package Leetcode;

import java.util.Arrays;

public class Check_if_Array_Is_Sorted_and_Rotated_1752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
		//15-04-2024
		int[] arr = { 3, 4, 5, 1, 2 };
		System.out.println(check(arr));
	}

	public static boolean check(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > nums[(i + 1) % nums.length]) {
				count++;
			}
			if (count > 1) {
				return false;
			}
		}
		return true;
	}

}
