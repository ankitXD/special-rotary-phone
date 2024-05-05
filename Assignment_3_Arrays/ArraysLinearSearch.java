package Assignment_3_Arrays;

import java.util.Scanner;

public class ArraysLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 7
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // 5 2 4 6 9 17 17
		}
		int m = sc.nextInt();
		System.out.println(LinearSearch(arr, n, m));
	}
	public static int LinearSearch(int[] arr, int n, int m) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == m) {
				return i;
			} 
		}
		return -1;
	}

}
