package Assignment_3_Arrays;

import java.util.Scanner;

public class CalculateTheSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		System.out.println(sum(arr, n, q));
//		5
//		1 2 3 4 5
//		2
//		1
//		0
	}

	public static int sum(int[] arr, int n, int q) {
		while (q-- > 0) {
			int x = sc.nextInt();
			int[] brr = new int[n];
			for (int i = 0; i < brr.length; i++) {
				int j = i - x;
				if (j < 0) {
					j = j + n;
				}
				brr[i] = arr[i] + arr[j];
			}
			arr = brr;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		sum = sum % 1000000007;

		return sum;

	}

}
