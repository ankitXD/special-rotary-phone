package Leetcode;

import java.util.Arrays;

public class Search_in_Rotated_Sorted_Array_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(arr, target));

	}

	public static int search(int[] nums, int target) {
		//Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
