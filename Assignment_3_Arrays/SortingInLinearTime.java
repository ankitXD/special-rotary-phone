package Assignment_3_Arrays;

import java.util.Scanner;

public class SortingInLinearTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		SortInLinearTime(arr);
	}
//	5
//	0
//	1
//	2
//	1
//	2

	public static void SortInLinearTime(int[] nums) {
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
