package Leetcode;

public class Move_Zeroes_283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/move-zeroes/description/
		//15-04-2024
		int[] arr = { 0, 1, 0, 3, 12 };
	}

	public static void moveZeroes(int[] nums) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		while(count<nums.length) {
			nums[count++] = 0;
		}
	}

}
