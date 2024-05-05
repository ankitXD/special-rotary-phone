package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortjustZeroesandOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = sorting(arr, n);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
//		7
//		1 0 0 1 1 0 1
	}

	public static int[] sorting(int[] arr, int n) {
//		int n1 = arr.length;
//		int[] sort = new int[n1];

//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//			}
//		}
		Arrays.sort(arr);
		return arr;
	}

}
