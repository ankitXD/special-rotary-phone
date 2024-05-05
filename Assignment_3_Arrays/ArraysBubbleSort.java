package Assignment_3_Arrays;

import java.util.Scanner;

public class ArraysBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
	}
//	4
//	2
//	-18
//	45
//	30

	public static void Sort(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
