package Leetcode;

public class Max_Consecutive_Ones_485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/max-consecutive-ones/description/
		//16-04-2024
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));
		/*
		 * IS MEI HAMNE DO VARIABLE LE LIYE EK COUNT AUR EK MAX COUNT TO JAB ARRAY MEI 
		 * 1 AYEGA TO COUNT BADHEGA AUR MAX COUNT MEI INN DONO MEI SE JO JADA HAI VO AYEGA
		 * AUR AGAR 0 AAGAYA TO COUNT 0 AUR END MEI MAX COUNT RETURN
		 */

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max_count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				count++;
				max_count = Math.max(max_count, count);
			}
			else {
				count = 0;
			}
		}

		return max_count;
	}

}
