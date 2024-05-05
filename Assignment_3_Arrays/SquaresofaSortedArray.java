package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = square(arr, n);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+ " ");
		}
	}
	public static int[] square(int[] arr, int n) {
		//Arrays.sort(arr);
		int n1 = arr.length;
		int[] square = new int[n1];
		for (int i = 0; i < arr.length; i++) {
			square[i] = arr[i]*arr[i];
		}
		Arrays.sort(square);
		return square;
	}

}
