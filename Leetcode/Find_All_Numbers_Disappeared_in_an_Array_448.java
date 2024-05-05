package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
		//29-04-2024
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappearedNumbers(arr);
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int idx = Math.abs(nums[i]) - 1;
			if (nums[idx] < 0)
				continue;

			nums[idx] *= -1;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				result.add(i + 1);
		}
		System.out.println(result);

		return result;
	}

}
