package Leetcode;

import java.util.Arrays;

public class Find_Minimum_in_Rotated_Sorted_Array_153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
		int[] arr = { 3, 4, 5, 1, 2 };
		System.out.println(findMin(arr));
		/*
		 * ISS QUESTION MEI HAME MINIMUM FIND KRNA HAI ROTATED ARRAY MEI
		 * HAM ISS ARRAY MEI PEHLE BINARY SEARCH LAGAYEGE AUR FIR DEKHEGE 
		 * KI HAME MINIMUM MILA KI NHI
		 */
	}
	public static int findMin(int[] nums) {
		int l = 0;
	    int r = nums.length - 1;

	    while (l < r) {
	      /*final*/ int m = (l + r) / 2;
	      if (nums[m] < nums[r])
	        r = m;
	      else
	        l = m + 1;
	    }

	    return nums[l];
		
		/*
		 * Arrays.sort(nums);
		 * return nums[0];
		 */
    }

}
