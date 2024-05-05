package Leetcode;

public class Running_Sum_of_1d_Array_1480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/running-sum-of-1d-array/description/
		// 04-05-2024
		int[] arr = { 1, 2, 3, 4 };
		int[] ans = runningSum(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
        return nums;
    }

}
