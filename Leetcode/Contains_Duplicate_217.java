package Leetcode;

import java.util.Arrays;

public class Contains_Duplicate_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/contains-duplicate/description/
		//24-04-2024
		int[] arr = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(int[] nums) {
		
		Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
				if(nums[i]==nums[i+1]) {
					return true;
				}
		}
		return false;
    }

}
