package Leetcode;

public class Majority_Element_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/majority-element/description/
		// 17-04-2024
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(arr));
		// Moore's voting algorithm
		/*
		 * JAB COUNT 0 HAI TO JO NUMS(I) MEI HAI VO CANDIDATE MEI JAKAR SAVE HOJAYEGA
		 * AUR FIR VHI CANDIDATE AUR NUMS OF I HAI TO COUNT BADGEA VRNA COUNT MINUS HOGA
		 */

	}

	public static int majorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
			}
			if (candidate == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}
}
