package Leetcode;

public class Number_of_Good_Pairs_1512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1, 1, 3 };
		System.out.println(numIdenticalPairs(arr));
	}
	public static int numIdenticalPairs(int[] nums) {
		
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j] && i < j) {
					count++; 
				}
			}
		}
		
		return count; 
    }

}
