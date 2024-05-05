package Leetcode;

public class Single_Number_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/single-number/description/
		//16-04-2024
		int[] nums = { 3, 4, 5, 4, 3 };
		System.out.println(singleNumber(nums));
		/*
		 * IS MEI HAM XOR OPERATION LAGAYEGE KYUKI 
		 * XOR MEI 1^2^1^2^4 KA ANSWER KA 1 hota hai 
		 * to usse value mei store krlenge
		 */
		
	}

	public static int singleNumber(int[] nums) {
		int value = 0;

		for (int i = 0; i < nums.length; i++) {
			value = value ^ nums[i];
		}

		return value;

	}

}
