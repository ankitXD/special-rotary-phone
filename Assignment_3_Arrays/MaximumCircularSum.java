package Assignment_3_Arrays;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(maxCircularSum(arr));
		}
	}
//	1
//	7
//	8 -8 9 -9 10 -11 12

	public static int maxCircularSum(int[] arr) {
		int linear_kadane = MaxSum(arr);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = arr[i] * (-1);
		}

		int inverted_kadane = MaxSum(arr);
		int circl_kadane = inverted_kadane + sum;

		return Math.max(linear_kadane, circl_kadane);
	}

	public static int MaxSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
