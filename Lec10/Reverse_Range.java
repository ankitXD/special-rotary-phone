package Lec10;

import java.util.Scanner;

public class Reverse_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ankit.nextInt();
		}
		int i = ankit.nextInt();
		int j = ankit.nextInt();
		reverse(arr, i, j);
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
