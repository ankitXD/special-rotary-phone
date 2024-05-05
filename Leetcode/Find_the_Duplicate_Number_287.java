package Leetcode;

import java.util.*;

public class Find_the_Duplicate_Number_287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-the-duplicate-number/description/
		//27-04-2024
		int[] arr = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(arr));
	}
	public static int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return nums[i];
			}
		}
		
		return -1;
		
		/* Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
            	return nums[i];
            }
            set.add(nums[i]);
        }
        return -1; */
		
		/* int slow = nums[0];
        int fast = nums[0];
        do { // we are sure that at least one duplicate is there
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast; */
    }
}
