package Assignment_3_Arrays;

import java.util.Scanner;

public class RunningSumoftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		runSum(arr);
	}

//	4
//	1 2 3 4
	public static void runSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
