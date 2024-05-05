package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxValue(arr, n));
	}

	public static int maxValue(int[] arr, int n) {
		Arrays.sort(arr);
		int num = arr[arr.length-1];//last index of array

		return num;
	}

}
