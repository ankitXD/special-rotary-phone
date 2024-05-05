package Leetcode;

public class Sort_Colors_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/sort-colors/description/
		//17-04-2024
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		sortColors(arr);
		/*
		 * ISS QUESTION MEI HAME SORT KARNE HAI PAR BINA SORT FUNCTION USE KRE
		 * THIS IS ALSO CALLED DUTCH NATIONAL FLAG PROBLEM BECAUSE THE COLORS AFTER
		 * SOLVING IT WILL BE EQUAL TO DUTCH FLAG
		 * WE'LL USE THE SAME ARRAY AND CREATE A START, MID, END AND 
		 * MOVE THE 0'S AT FIRST AND IF 2'S APPEARS SO SWAP IT AT THE END
		 */
	}

	public static void sortColors(int[] nums) {
		int start = 0;
	    int mid = 0;
	    int end = nums.length - 1;

	    while (mid <= end) {

	      switch (nums[mid]) {
	        case 0:
	          // Swap with start index
	          swap(nums, start, mid);
	          mid++;
	          start++;
	          break;

	        case 1:
	          mid++;
	          break;

	        case 2:
	          // Swap with end index
	          swap(nums, mid, end);
	          end--;
	          break;
	      }
	    }
	    for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
	}
	public static void swap(int[] arr, int pos1, int pos2) {
	    int temp = arr[pos1];
	    arr[pos1] = arr[pos2];
	    arr[pos2] = temp;
	  }
}
